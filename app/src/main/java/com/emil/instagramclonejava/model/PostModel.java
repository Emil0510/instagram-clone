package com.emil.instagramclonejava.model;

import android.net.Uri;

public class PostModel {

    public String email;
    public String comment;
    public String downloadUrl;
    public PostModel(String comment, String downloadUrl,String email){
        this.comment=comment;
        this.downloadUrl=downloadUrl;
        this.email=email;
    }


}
