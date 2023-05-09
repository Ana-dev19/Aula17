public class ExUm {
    public class Televisao {
        private int volume;
        private int canal;

        public Televisao() {
            this.volume = 0;
            this.canal = 1;
        }

        public void aumentarVolume() {
            this.volume++;
        }

        public void diminuirVolume() {
            this.volume--;
        }

        public void aumentarCanal() {
            this.canal++;
        }

        public void diminuirCanal() {
            this.canal--;
        }

        public void trocarCanal(int canal) {
            this.canal = canal;
        }

        public int getVolume() {
            return volume;
        }

        public int getCanal() {
            return canal;
        }
    }

    public class ControleRemoto {
        private Televisao televisao;

        public ControleRemoto(Televisao televisao) {
            this.televisao = televisao;
        }

        public void aumentarVolume() {
            televisao.aumentarVolume();
        }

        public void diminuirVolume() {
            televisao.diminuirVolume();
        }

        public void aumentarCanal() {
            televisao.aumentarCanal();
        }

        public void diminuirCanal() {
            televisao.diminuirCanal();
        }

        public void trocarCanal(int canal) {
            televisao.trocarCanal(canal);
        }

        public int getVolume() {
            return televisao.getVolume();
        }

        public int getCanal() {
            return televisao.getCanal();
        }
    }
}
