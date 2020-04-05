SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

CREATE TABLE IF NOT EXISTS `libraryaps`.`Book` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `title` VARCHAR(100) NOT NULL,
  `isbn` VARCHAR(9) NOT NULL,
  `edition` INT(11) NOT NULL,
  `year` INT(11) NOT NULL,
  `cover` VARCHAR(45) NULL DEFAULT NULL,
  `file` VARCHAR(45) NULL DEFAULT NULL,
  `idPublisher` INT(11) NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_tbLivro_tbEditora1_idx` (`idPublisher` ASC) ,
  UNIQUE INDEX `titulo_UNIQUE` (`title` ASC) ,
  CONSTRAINT `fk_tbLivro_tbEditora1`
    FOREIGN KEY (`idPublisher`)
    REFERENCES `libraryaps`.`Publisher` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `libraryaps`.`Subject` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `subject` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `assunto_UNIQUE` (`subject` ASC) )
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `libraryaps`.`Copy` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `loanable` TINYINT(1) NULL DEFAULT NULL,
  `idBook` INT(11) NULL DEFAULT NULL,
  `idMagazine` INT(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_tbExemplar_tbLivro1_idx` (`idBook` ASC) ,
  INDEX `fk_Copy_Magazine1_idx` (`idMagazine` ASC) ,
  CONSTRAINT `fk_tbExemplar_tbLivro1`
    FOREIGN KEY (`idBook`)
    REFERENCES `libraryaps`.`Book` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Copy_Magazine1`
    FOREIGN KEY (`idMagazine`)
    REFERENCES `libraryaps`.`Magazine` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `libraryaps`.`Loan` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `loanDate` DATE NOT NULL,
  `returnDate` DATE NULL DEFAULT NULL,
  `expectedReturnDate` DATE NOT NULL,
  `idCopy` INT(11) NOT NULL,
  `idUser` INT(11) NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_tbEmprestimo_tbExemplar1_idx` (`idCopy` ASC) ,
  INDEX `fk_tbEmprestimo_tbUsuario1_idx` (`idUser` ASC) ,
  CONSTRAINT `fk_tbEmprestimo_tbExemplar1`
    FOREIGN KEY (`idCopy`)
    REFERENCES `libraryaps`.`Copy` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_tbEmprestimo_tbUsuario1`
    FOREIGN KEY (`idUser`)
    REFERENCES `libraryaps`.`User` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `libraryaps`.`User` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(100) NOT NULL,
  `type` VARCHAR(20) NOT NULL,
  `email` VARCHAR(100) NOT NULL,
  `user` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `usuario_UNIQUE` (`user` ASC) )
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `libraryaps`.`Publisher` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `nome_UNIQUE` (`name` ASC) )
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `libraryaps`.`Author` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `nome_UNIQUE` (`name` ASC) )
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `libraryaps`.`AuthorBook` (
  `idBook` INT(11) NOT NULL,
  `idAuthor` INT(11) NOT NULL,
  PRIMARY KEY (`idBook`, `idAuthor`),
  INDEX `fk_tbLivro_has_tbAutores_tbAutores1_idx` (`idAuthor` ASC) ,
  INDEX `fk_tbLivro_has_tbAutores_tbLivro1_idx` (`idBook` ASC) ,
  CONSTRAINT `fk_tbLivro_has_tbAutores_tbLivro1`
    FOREIGN KEY (`idBook`)
    REFERENCES `libraryaps`.`Book` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_tbLivro_has_tbAutores_tbAutores1`
    FOREIGN KEY (`idAuthor`)
    REFERENCES `libraryaps`.`Author` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `libraryaps`.`BookSubject` (
  `idBook` INT(11) NOT NULL,
  `idSubject` INT(11) NOT NULL,
  PRIMARY KEY (`idBook`, `idSubject`),
  INDEX `fk_Livro_has_Assunto_Assunto1_idx` (`idSubject` ASC) ,
  INDEX `fk_Livro_has_Assunto_Livro1_idx` (`idBook` ASC) ,
  CONSTRAINT `fk_Livro_has_Assunto_Livro1`
    FOREIGN KEY (`idBook`)
    REFERENCES `libraryaps`.`Book` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Livro_has_Assunto_Assunto1`
    FOREIGN KEY (`idSubject`)
    REFERENCES `libraryaps`.`Subject` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `libraryaps`.`Reservation` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `reservationDate` DATE NOT NULL,
  `expectedReturnDate` DATE NOT NULL,
  `canceled` TINYINT(1) NULL DEFAULT NULL,
  `noteCancellation` VARCHAR(45) NULL DEFAULT NULL,
  `idCopy` INT(11) NOT NULL,
  `idUser` INT(11) NOT NULL,
  `idLoan` INT(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_Reserva_Exemplar1_idx` (`idCopy` ASC) ,
  INDEX `fk_Reserva_Usuario1_idx` (`idUser` ASC) ,
  INDEX `fk_Reserva_Emprestimo1_idx` (`idLoan` ASC) ,
  CONSTRAINT `fk_Reserva_Exemplar1`
    FOREIGN KEY (`idCopy`)
    REFERENCES `libraryaps`.`Copy` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Reserva_Usuario1`
    FOREIGN KEY (`idUser`)
    REFERENCES `libraryaps`.`User` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Reserva_Emprestimo1`
    FOREIGN KEY (`idLoan`)
    REFERENCES `libraryaps`.`Loan` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `libraryaps`.`Magazine` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `title` VARCHAR(100) NOT NULL,
  `edition` INT(11) NOT NULL,
  `year` INT(11) NOT NULL,
  `cover` VARCHAR(45) NULL DEFAULT NULL,
  `file` VARCHAR(45) NULL DEFAULT NULL,
  `idPublisher` INT(11) NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_tbLivro_tbEditora1_idx` (`idPublisher` ASC) ,
  UNIQUE INDEX `titulo_UNIQUE` (`title` ASC) ,
  CONSTRAINT `fk_tbLivro_tbEditora10`
    FOREIGN KEY (`idPublisher`)
    REFERENCES `libraryaps`.`Publisher` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `libraryaps`.`AuthorMagazine` (
  `idMagazine` INT(11) NOT NULL,
  `idAuthor` INT(11) NOT NULL,
  PRIMARY KEY (`idMagazine`, `idAuthor`),
  INDEX `fk_tbLivro_has_tbAutores_tbAutores1_idx` (`idAuthor` ASC) ,
  INDEX `fk_AuthorBook_copy1_Magazine1_idx` (`idMagazine` ASC) ,
  CONSTRAINT `fk_tbLivro_has_tbAutores_tbAutores10`
    FOREIGN KEY (`idAuthor`)
    REFERENCES `libraryaps`.`Author` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_AuthorBook_copy1_Magazine1`
    FOREIGN KEY (`idMagazine`)
    REFERENCES `libraryaps`.`Magazine` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `libraryaps`.`MagazineSubject` (
  `idMagazine` INT(11) NOT NULL,
  `idSubject` INT(11) NOT NULL,
  PRIMARY KEY (`idMagazine`, `idSubject`),
  INDEX `fk_Livro_has_Assunto_Assunto1_idx` (`idSubject` ASC) ,
  INDEX `fk_BookSubject_copy1_Magazine1_idx` (`idMagazine` ASC) ,
  CONSTRAINT `fk_Livro_has_Assunto_Assunto10`
    FOREIGN KEY (`idSubject`)
    REFERENCES `libraryaps`.`Subject` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_BookSubject_copy1_Magazine1`
    FOREIGN KEY (`idMagazine`)
    REFERENCES `libraryaps`.`Magazine` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

USE libraryaps;
INSERT INTO User (name, type, email, user, password) VALUES ('Administrador', 'ADMINISTRATOR', 'admin@admin.com', 'admin', 'admin');
COMMIT;