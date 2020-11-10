package SundayPractice_day13;

public class NestedIfbrowser {
    public static void main(String[] args) {

     String browserName= "Cybertek";
     boolean valid = browserName == "Chrome" || browserName == "Opera" ||
             browserName == "Safari" || browserName =="firefox" ||
             browserName == "ie";
     String selectedBrowser = "browser is selected";



     if(valid){

          if(browserName == "Chrome"){
             selectedBrowser = "Chrome";
          }else if(browserName == "firefox"){
             selectedBrowser="firefox";
          }else if(browserName=="opera"){
              selectedBrowser = "opera";
          }else if(browserName=="Safari"){
              selectedBrowser = "Safari";
          }else{
              selectedBrowser = "io";
          }


     }else{
         System.out.println("No such a browser");
     }
































    }
}
