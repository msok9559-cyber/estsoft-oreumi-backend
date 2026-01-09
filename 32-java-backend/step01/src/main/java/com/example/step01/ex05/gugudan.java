package com.example.step01.ex05;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/gugudan")
public class gugudan extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        String danParam = request.getParameter("dan");
        response.setContentType("text/html;charset=UTF-8");

        String output = """
                <!DOCTYPE html>
                <html>
                <head>
                <meta charset="UTF-8">
                <title>gugudan</title>
                </head>
                <body>
                <h1>Multiplication Table</h1>
                """;
                if (danParam != null) {
                    try {
                        int dan = Integer.parseInt(danParam);
                        if (dan >= 2 && dan <= 9){
                            for (int i = 1; i <= 9; i++){
                                output += dan + "x" + i + " = " + (dan * i) + "<br>";
                            }
                        }else {
                            output += "<p> 2 부터 9 사이의 숫자만 입력하세요.</p>";
                        }
                    }catch (NumberFormatException e){
                        output += "<p> 숫자만 입력하세요.</p>";
                    }
                }
                output += """
                        <form method="get" action="gugudan">
                            Multiplication table for<input type="text" name="dan">
                            <input type="submit" name="print">
                        </form>
                        </body>
                        </html>
                        """;

        out.print(output);
        out.close();

    }
}