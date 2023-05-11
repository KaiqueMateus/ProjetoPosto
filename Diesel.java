package calculos;

public class Diesel extends calculo {
		
		private float somalitdie;
		
		public Diesel(float somalitdie) {
			this.somalitdie = somalitdie;
		}
		@Override
		public float calc_comb() {
				return (float) (somalitdie * 2.96);
		}
}
