package com.composition;

public class Home {

        private Bed bed;
        private Table table;
        private Sofa sofa;

        public Home(Bed bed, Table table, Sofa sofa) {
                this.bed = bed;
                this.table = table;
                this.sofa = sofa;
        }

        public Bed getBed() {
                return bed;
        }

        public Table getTable() {
                return table;
        }

        public Sofa getSofa() {
                return sofa;
        }
}
