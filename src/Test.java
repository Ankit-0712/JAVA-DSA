class Solution{
    int var1;
    int var2;
    int ans;
    public void get_input(){
        var1 =  25;
        var2 = 25;
    
    }
    public void calculateSum(){
        ans = var1 + var2;
    }
    public void display(){
        System.out.println(ans);
    }
    


}
public class Test {
    public static void main(String [] args){
        Solution obj_e1 = new Solution();
       obj_e1. get_input();
        obj_e1.calculateSum();
       obj_e1. display();
    }
    
}
