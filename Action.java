public class Action {

    //class Variables
    private Method method;
    private char hotkey;
    public char getHotkey() {
        return hotkey;
    }

    public void setHotkey(char hotkey) { this.hotkey = hotkey; }

    private String name;
    public String getName() { return name;}

    public void setName(String name) { this.name = name; }

    private Enemy kwargs;

    public Enemy getKwargs() { return kwargs; }

    public void setKwargs(Enemy kwargs) { this.kwargs = kwargs; }

    //Constructor method
    public Action(Method method, String name, char hotkey, Enemy kwargs ){
        //these are instance variables
        this.method = method;
        this.hotkey = hotkey;
        this.name = name;
        this.kwargs = kwargs;
    }

    //Will return a human readable string
    public String str() { return hotkey + ": " + name; }
}
