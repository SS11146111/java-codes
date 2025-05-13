package com.sangita.designpatterns;

public class DocumentPrototypeDemo  implements Cloneable {
	    String content;

	    public DocumentPrototypeDemo(String content) {
	        this.content = content;
	    }

	    public DocumentPrototypeDemo clone() {
	        try {
	            return (DocumentPrototypeDemo) super.clone();
	        } catch (CloneNotSupportedException e) {
	            return null;
	        }
	    }
}




