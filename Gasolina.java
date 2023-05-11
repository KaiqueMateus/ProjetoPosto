package calculos;

public class Gasolina extends calculo {
		
		private float somalitgas;
		
		public Gasolina(float somalitgas) {
			this.somalitgas = somalitgas;
		}
		@Override
		public float calc_comb() {
				return (float) (somalitgas * 6.07);
		}
}
