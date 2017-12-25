<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <title>Онлайн библиотека::Вход</title>
        <link href="css/styleindex.css" rel="stylesheet" type="text/css">
            </head>
            
    <body>
        <div class="main">
            
            <div class="content">
                <p class="title"><span class="text"><img src="images/lib.png" width="76" height="77" hspace="10" vspace ="10" allign="midle"/></span></p> 
                <p class="title"> Онлайн библиотека</p>
                 <p class="text"> Добро пожаловать в онлайн библиотеку. Это мой первый серьезный проект. Вы сможете найти здесь литературу на любой вкус. Доступны функции поиска, просмотра, сортировки и многие другие.</p>
                 <p class="text"> Проект находится в разработке, поэтому дизайн и функционал будут постоянно дорабатываться.</p>
                 <p class="text"> По всем возникающим вопросам обращайтесь по адресу: <a href="mailto:11kotov11@mail.ru"> 11kotov11@mail.ru </a></p>
                 <p>&nbsp;</p>
                </div>
            
            <div class="login_div">
                <p class="title" >Для входа введите свои данные:</p>
                <form class="login_form" name="username" action="pages/main.jsp" method="POST">
               
                    Имя:<input type="text" name="username" value="" size="20" />
                    <input type="submit" value="Войти" />
                </form>
            </div>
            
            <div class="footer">
                Разработчик: Котов Александр Юрьевич, 2016 год
            </div>
        </div>
    </body>
</html>