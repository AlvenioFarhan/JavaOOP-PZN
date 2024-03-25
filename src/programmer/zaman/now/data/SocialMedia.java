package programmer.zaman.now.data;

 class SocialMedia {
   private String name;
}

 class Facebook extends SocialMedia{
     final void login(String username, String password){
         //isi method
     }

}

//ERROR
class FakeFacebook extends Facebook{
//    void login(String username, String password){
//        //isi method
//    }
}
