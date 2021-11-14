class CCount{
   private static int cnt=0;//應設為類別變數，每個函數的cnt都會指向同一個變數做變化

   CCount(){
      count();
   }
    void count(){//都可以
      cnt++;
   }
   static void setZero(){
      cnt=0;
   }
   static void setValue(int n){
     cnt=n;
   }
}
