
public enum InstituitionType {
    UNIVERSITY, COMPANY, NGO, OTHER;

    private InstituitionType() {
        // compiled code
    }

    public String toString() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: getstatic     #7                  // Field cbl/participants/InstituitionType$1.$SwitchMap$cbl$participants$InstituitionType:[I
         * 3: aload_0
         * 4: invokevirtual #8                  // Method ordinal:()I
         * 7: iaload
         * 8: tableswitch   { // 1 to 4
         * 1: 40
         * 2: 43
         * 3: 46
         * 4: 49
         * default: 52
         * }
         * 40: ldc           #9                  // String Universitary
         * 42: areturn
         * 43: ldc           #10                 // String Company
         * 45: areturn
         * 46: ldc           #11                 // String NGO
         * 48: areturn
         * 49: ldc           #12                 // String Other
         * 51: areturn
         * 52: ldc           #13                 // String Unknown
         * 54: areturn
         *  */
        // </editor-fold>
    }
}
