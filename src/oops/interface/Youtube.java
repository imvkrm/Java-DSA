public interface Youtube extends VideoEditor//,StudentIF 
{// can extends multiple interfaces
    public void makeVideos();


   // after Java 8.0 we can define a default implementation of methods we can again define them in implemented class 
   default void uploadVideo(){// it's not mendatory to override this 
        System.out.println("youtuber uploading video");
    }
// this same method is there in two or more interfaces implemented by class then we have to override this in that class to avoid Diamond problem

}
