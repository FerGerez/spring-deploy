package com.example.springdeploy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Esta clase va ser la encargada de enviar saludos
 * @author Fernando
 */
@RestController
public class HelloController {

    @Value("${app.message}")
    String message;

    /**
     *  sirve para saludar
     * @return un String con un saludo
     */
    @GetMapping("/hola")
    public String holaMundo (){
        System.out.println(message);
        return "Hola mundo, qué tal!!! Adiós";

    }

    /**
     * http://localhost:8080/boostrap
     * Envía un saludo en el navegador usando boostrap con hmtl,
     * @return un saludo y un botón que envía a Google
     */

    @GetMapping("/boostrap")
    public String boostrap (){
        return """
                <!doctype html>
                <html lang="en">
                  <head>
                    <!-- Required meta tags -->
                    <meta charset="utf-8">
                    <meta name="viewport" content="width=device-width, initial-scale=1">
                                
                    <!-- Bootstrap CSS -->
                    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
                                
                    <title>Hola mundo, desde Spring Boot!</title>
                  </head>
                  <body>
                    <h1>Hola mundo, desde Spring Boot!</h1>
                     <a class="btn btn-primary" href="https://www.google.com/search?q=hola+mundo&sxsrf=AJOqlzXbu4kgCMhFqpQoWHHAKblKSgcn2g%3A1673506878941&ei=PrC_Y-WMOZnR1sQP5rGM0Ac&ved=0ahUKEwjlo7H4usH8AhWZqJUCHeYYA3oQ4dUDCA8&uact=5&oq=hola+mundo&gs_lcp=Cgxnd3Mtd2l6LXNlcnAQAzILCAAQgAQQsQMQgwEyBQgAEIAEMgoIABCABBCHAhAUMggILhDUAhCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDoKCAAQRxDWBBCwAzoHCAAQsAMQQzoNCAAQ5AIQ1gQQsAMYAToSCC4QxwEQ0QMQyAMQsAMQQxgCOgQIABBDOgcILhCxAxBDOgcILhDUAhBDOgoIABCxAxCDARBDOgcIABCxAxBDOgQILhBDOg0IABCABBCxAxCDARAKOgcILhCABBAKOgoILhCABBCxAxAKOgcIABCABBAKOggILhCABBDUAkoECEEYAEoECEYYAVDIBFixDWDmEWgBcAF4AIABaYgBngSSAQM1LjGYAQCgAQHIARDAAQHaAQYIARABGAnaAQYIAhABGAg&sclient=gws-wiz-serp"> Google </a>           
                    <!-- Optional JavaScript; choose one of the two! -->
                                
                    <!-- Option 1: Bootstrap Bundle with Popper -->
                    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
                                
                    <!-- Option 2: Separate Popper and Bootstrap JS -->
                    <!--
                    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script>
                    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>
                    -->
                  </body>
                </html>
                
                """;
    }



}
