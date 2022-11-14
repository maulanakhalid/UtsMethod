public class Method {
    public static void UbahHurufEToStar(String [] Terkadang){
        for (int index=0;index< Terkadang.length;index++){
            System.out.println(Terkadang[index].replace("e","*"));
        }
    }
    public static void main(String[]args){
        String[]_block = new String[]{"triagle", "cubes" ,"Circle"};
        UbahHurufEToStar(_block);
    }
}
