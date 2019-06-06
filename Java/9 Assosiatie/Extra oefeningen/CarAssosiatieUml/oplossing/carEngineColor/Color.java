package carEngineColor;

public class Color {

		private String name;
		private int[] rgb = new int[3];
		
		
		public Color(String name, int[] rgb) {
			super();
			this.name = name;
			this.rgb = rgb;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int[] getRgb() {
			return rgb;
		}
		public void setRgb(int[] rgb) {
			this.rgb = rgb;
		}
		public int getPrice() {
			int temp = rgb[0] + rgb[1] +rgb[2];
			return temp;
		}
		
		
}
