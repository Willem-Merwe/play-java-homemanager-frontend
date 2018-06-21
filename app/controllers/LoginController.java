package controllers;

import play.mvc.*;

import views.html.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class LoginController extends Controller {
    
    public Result result() {
        return ok(views.html.login.render("Home Management"));
    }

}
