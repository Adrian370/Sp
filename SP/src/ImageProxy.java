
public class ImageProxy implements Element {

	public String imageName;
	public Image realImage;
	
	ImageProxy(String imageName){
		this.imageName = imageName;
	}
	
	@Override
	public void print() {
		if(realImage == null) {
			realImage = new Image(imageName);
		}
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return "ImageProxy [imageName=" + imageName + ", realImage=" + realImage + "]";
	}
	

}
