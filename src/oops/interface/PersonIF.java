public class PersonIF implements StudentIF, Youtube {
// allow us to get the functionality of multiple inheritence
    @Override
    public void study() {

    }

    @Override
    public void makeVideos() {

    }
    @Override
    public void editVideo() {//from extended interface VideoEditor

    }

//for callback
    static Football football;
    private static synchronized Football getFootballCallBack() {
        return football;
    }
    public void setFootballCallBack(Football football) {
        PersonIF.football = football;
    }

public static void main(String[] args) {
    getFootballCallBack().playFootball();//for callback

    PersonIF obj =new PersonIF();

    obj.editVideo();
    obj.study();
    obj.makeVideos();

    Youtube obj2=obj;// upcasting (type casting) is allowed so PersonIF became Youtube
    obj2.editVideo();
    obj2.makeVideos();
    
}
   
}
