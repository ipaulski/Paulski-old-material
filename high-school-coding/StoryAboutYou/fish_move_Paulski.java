
public class fish_move_Paulski
{
    public fish_move_Paulski(){}

    public void task1(){
        System.out.println("        ,--,_               ");
        System.out.println("__     _\\.---'-.       ");
        System.out.println("\\ \'.-\"      // o\\  "); 
        System.out.println("/_.\'-._     \\\\  / o");
        System.out.println("         \"--(/\"'");
        System.out.println(" ");
        try{
            Thread.sleep(500);
        }
        catch(InterruptedException ie){
        }
        System.out.print('\u000c');
        System.out.println("         ,--,_               ");
        System.out.println(" __     _\\.---'-.       ");
        System.out.println(" \\ \'.-\"      // o\\  "); 
        System.out.println(" /_.\'-._     \\\\  / o");
        System.out.println("          \"--(/\"'");
        System.out.println("  ");
        try{
            Thread.sleep(500);
        }
        catch(InterruptedException ie){
        }
        System.out.print('\u000c');
        System.out.println("          ,--,_               ");
        System.out.println("  __     _\\.---'-.       ");
        System.out.println("  \\ \'.-\"      // o\\  "); 
        System.out.println("  /_.\'-._     \\\\  / o");
        System.out.println("           \"--(/\"'");
        System.out.println("   ");
        try{
            Thread.sleep(500);
        }
        catch(InterruptedException ie){
        }
        System.out.print('\u000c');
        System.out.println("           ,--,_               ");
        System.out.println("   __     _\\.---'-.       ");
        System.out.println("   \\ \'.-\"      // o\\  "); 
        System.out.println("   /_.\'-._     \\\\  / o");
        System.out.println("            \"--(/\"'");
        System.out.println("    ");
        try{
            Thread.sleep(500);
        }
        catch(InterruptedException ie){
        }
        System.out.print('\u000c');
        System.out.println("            ,--,_               ");
        System.out.println("    __     _\\.---'-.       ");
        System.out.println("    \\ \'.-\"      // o\\  "); 
        System.out.println("    /_.\'-._     \\\\  / o");
        System.out.println("             \"--(/\"'");
        System.out.println("     ");
        try{
            Thread.sleep(500);
        }
        catch(InterruptedException ie){
        }
        System.out.print('\u000c');
        System.out.println("             ,--,_               ");
        System.out.println("     __     _\\.---'-.       ");
        System.out.println("     \\ \'.-\"      // o\\  "); 
        System.out.println("     /_.\'-._     \\\\  / o");
        System.out.println("              \"--(/\"'");
        System.out.println("      ");
        try{
            Thread.sleep(500);
        }
        catch(InterruptedException ie){
        }
        System.out.print('\u000c');
        System.out.println("              ,--,_               ");
        System.out.println("      __     _\\.---'-.       ");
        System.out.println("      \\ \'.-\"      // o\\  "); 
        System.out.println("      /_.\'-._     \\\\  / o");
        System.out.println("               \"--(/\"'");
        System.out.println("       ");
        try{
            Thread.sleep(500);
        }
        catch(InterruptedException ie){
        }
        System.out.print('\u000c');
        System.out.println("               ,--,_               ");
        System.out.println("       __     _\\.---'-.       ");
        System.out.println("       \\ \'.-\"      // o\\  "); 
        System.out.println("       /_.\'-._     \\\\  / o");
        System.out.println("                \"--(/\"'");
        System.out.println("        ");
        try{
            Thread.sleep(500);
        }
        catch(InterruptedException ie){
        }
        System.out.print('\u000c');
        System.out.println("                ,--,_               ");
        System.out.println("        __     _\\.---'-.       ");
        System.out.println("        \\ \'.-\"      // o\\  "); 
        System.out.println("        /_.\'-._     \\\\  / o");
        System.out.println("                 \"--(/\"'");
        System.out.println("      ");
        try{
            Thread.sleep(500);
        }
        catch(InterruptedException ie){
        }
        System.out.print('\u000c');
        System.out.println("                 ,--,_               ");
        System.out.println("         __     _\\.---'-.       ");
        System.out.println("         \\ \'.-\"      // o\\  "); 
        System.out.println("         /_.\'-._     \\\\  / o");
        System.out.println("                  \"--(/\"'");
        System.out.println("       ");
        try{
            Thread.sleep(500);
        }
        catch(InterruptedException ie){
        }
        System.out.print('\u000c');
        System.out.println("                  ,--,_               ");
        System.out.println("          __     _\\.---'-.       ");
        System.out.println("          \\ \'.-\"      // o\\  "); 
        System.out.println("          /_.\'-._     \\\\  / o");
        System.out.println("                   \"--(/\"'");
        System.out.println("       ");
    }

    public void task2(){
        int i = 0;
        String p = ""+(char)32;
        for(i = 0; i < 10; i++){
            System.out.println(p+"        ,--,_               ");
            System.out.println(p+"__     _\\.---'-.       ");
            System.out.println(p+"\\ \'.-\"      // o\\  "); 
            System.out.println(p+"/_.\'-._     \\\\  / o");
            System.out.println(p+"         \"--(/\"'");

            try{
                Thread.sleep(500);
            }
            catch(InterruptedException ie){
            }

            System.out.print('\u000c');
            p+=""+(char)32;
        }
    }
    public void task3(){
        int i = 0;
        String p = ""+(char)8;
        String g = "          ";
        for(i = 0; i < 10; i++){
            System.out.println(g+"        ,--,_               ");
            System.out.println(g+"__     _\\.---'-.       ");
            System.out.println(g+"\\ \'.-\"      // o\\  "); 
            System.out.println(g+"/_.\'-._     \\\\  / o");
            System.out.println(g+"         \"--(/\"'");
            try{
                Thread.sleep(500);
            }
            catch(InterruptedException ie){
            }
            System.out.print('\u000c');
            g+=""+(char)8;
        }
    }
}