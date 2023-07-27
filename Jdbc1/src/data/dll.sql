/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  irvin
 * Created: Jul 26, 2023
 */

create table mahasiswa(
    id int primary key auto_increment,
    nim varchar(8) not null unique,
    nama varchar(255) not null
)
 engine = InnoDB;
