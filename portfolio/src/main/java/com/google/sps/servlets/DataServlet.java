
package com.google.sps.servlets;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import com.google.gson.Gson;

/** Servlet that returns some example content. TODO: modify this file to handle comments data */
@WebServlet("/data")
public class DataServlet extends HttpServlet {
    
  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    ArrayList<String> comments = getFakeComments();
    String json = toJsonString(comments);    
    response.setContentType("application/json;");
    response.getWriter().println(json);
  }
  private String toJsonString(ArrayList<String> comments){
      Gson gson = new Gson();
      String json = gson.toJson(comments);
      return json;

  }
  public ArrayList<String> getFakeComments(){
    ArrayList<String> comments = new ArrayList<String>();
    comments.add("Black Lives Matter!"); 
    comments.add("The beginnings of a nice website, Jaz!");
    comments.add("Website still needs some work but it's coming together!"); 
    return comments;
  }
}
