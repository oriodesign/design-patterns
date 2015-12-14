package design.patterns.interpreter;

public class Expression{
    private string searchString = "";
    public Expression(String searchString){
        this.searchString = searchString;
    }
    public String interpret( Context context){
        // context.getAllBooks();
        // filter books by searchString
    }
}