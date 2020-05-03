package com.hrushitjain.objectidentifier;

import android.graphics.Bitmap;
import java.util.List;

public interface Classifier {
    class Recognition{
        private final String id;
        private final String title;
        private final Float confidence;

        Recognition(final String id, final String title, final Float confidence){
            this.id = id;
            this.title = title;
            this.confidence = confidence;
        }

        Float getConfidence(){
            return confidence;
        }


        @Override
        public String toString(){
            String resultString = "";
            if(id!=null){
                resultString +="["+id+"]";
            }
            if(title!=null)
                resultString +=title+" ";
            if(confidence!=null)
                resultString += String.format("(%.1f)",confidence*100);
            return resultString.trim();
        }
    }
    List<Recognition> recognizeImage(Bitmap bitmap);
    void close();
}
