/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

/**
 *
 * @author 8603711
 */
public class Gabarito {
    
    private int cd_gabarito;
    private int resposta1;
    private int resposta2;
    private int resposta3;
    private int resposta4;
    private int resposta5;
    private int resposta6;
    private int resposta7;
    private int resposta8;
    private int resposta9;
    private int resposta10;
    private int resposta11;
    private int resposta12;
    private int resposta13;
    private int resposta14;
    private int resposta15;
    private int resposta16;
    private int resposta17;
    private int resposta18;
    private int resposta19;
    private int resposta20;

    public Gabarito(int cd_gabarito, int resposta1, int resposta2, int resposta3, int resposta4, int resposta5, int resposta6, int resposta7, int resposta8, int resposta9, int resposta10, int resposta11, int resposta12, int resposta13, int resposta14, int resposta15, int resposta16, int resposta17, int resposta18, int resposta19, int resposta20) {
        this.cd_gabarito = cd_gabarito;
        this.resposta1 = resposta1;
        this.resposta2 = resposta2;
        this.resposta3 = resposta3;
        this.resposta4 = resposta4;
        this.resposta5 = resposta5;
        this.resposta6 = resposta6;
        this.resposta7 = resposta7;
        this.resposta8 = resposta8;
        this.resposta9 = resposta9;
        this.resposta10 = resposta10;
        this.resposta11 = resposta11;
        this.resposta12 = resposta12;
        this.resposta13 = resposta13;
        this.resposta14 = resposta14;
        this.resposta15 = resposta15;
        this.resposta16 = resposta16;
        this.resposta17 = resposta17;
        this.resposta18 = resposta18;
        this.resposta19 = resposta19;
        this.resposta20 = resposta20;
    }

    public Gabarito() {
        super();
    }
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.cd_gabarito;
        hash = 53 * hash + this.resposta1;
        hash = 53 * hash + this.resposta2;
        hash = 53 * hash + this.resposta3;
        hash = 53 * hash + this.resposta4;
        hash = 53 * hash + this.resposta5;
        hash = 53 * hash + this.resposta6;
        hash = 53 * hash + this.resposta7;
        hash = 53 * hash + this.resposta8;
        hash = 53 * hash + this.resposta9;
        hash = 53 * hash + this.resposta10;
        hash = 53 * hash + this.resposta11;
        hash = 53 * hash + this.resposta12;
        hash = 53 * hash + this.resposta13;
        hash = 53 * hash + this.resposta14;
        hash = 53 * hash + this.resposta15;
        hash = 53 * hash + this.resposta16;
        hash = 53 * hash + this.resposta17;
        hash = 53 * hash + this.resposta18;
        hash = 53 * hash + this.resposta19;
        hash = 53 * hash + this.resposta20;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Gabarito other = (Gabarito) obj;
        if (this.cd_gabarito != other.cd_gabarito) {
            return false;
        }
        if (this.resposta1 != other.resposta1) {
            return false;
        }
        if (this.resposta2 != other.resposta2) {
            return false;
        }
        if (this.resposta3 != other.resposta3) {
            return false;
        }
        if (this.resposta4 != other.resposta4) {
            return false;
        }
        if (this.resposta5 != other.resposta5) {
            return false;
        }
        if (this.resposta6 != other.resposta6) {
            return false;
        }
        if (this.resposta7 != other.resposta7) {
            return false;
        }
        if (this.resposta8 != other.resposta8) {
            return false;
        }
        if (this.resposta9 != other.resposta9) {
            return false;
        }
        if (this.resposta10 != other.resposta10) {
            return false;
        }
        if (this.resposta11 != other.resposta11) {
            return false;
        }
        if (this.resposta12 != other.resposta12) {
            return false;
        }
        if (this.resposta13 != other.resposta13) {
            return false;
        }
        if (this.resposta14 != other.resposta14) {
            return false;
        }
        if (this.resposta15 != other.resposta15) {
            return false;
        }
        if (this.resposta16 != other.resposta16) {
            return false;
        }
        if (this.resposta17 != other.resposta17) {
            return false;
        }
        if (this.resposta18 != other.resposta18) {
            return false;
        }
        if (this.resposta19 != other.resposta19) {
            return false;
        }
        if (this.resposta20 != other.resposta20) {
            return false;
        }
        return true;
    }

    public int getCd_gabarito() {
        return cd_gabarito;
    }

    public void setCd_gabarito(int cd_gabarito) {
        this.cd_gabarito = cd_gabarito;
    }

    public int getResposta1() {
        return resposta1;
    }

    public void setResposta1(int resposta1) {
        this.resposta1 = resposta1;
    }

    public int getResposta2() {
        return resposta2;
    }

    public void setResposta2(int resposta2) {
        this.resposta2 = resposta2;
    }

    public int getResposta3() {
        return resposta3;
    }

    public void setResposta3(int resposta3) {
        this.resposta3 = resposta3;
    }

    public int getResposta4() {
        return resposta4;
    }

    public void setResposta4(int resposta4) {
        this.resposta4 = resposta4;
    }

    public int getResposta5() {
        return resposta5;
    }

    public void setResposta5(int resposta5) {
        this.resposta5 = resposta5;
    }

    public int getResposta6() {
        return resposta6;
    }

    public void setResposta6(int resposta6) {
        this.resposta6 = resposta6;
    }

    public int getResposta7() {
        return resposta7;
    }

    public void setResposta7(int resposta7) {
        this.resposta7 = resposta7;
    }

    public int getResposta8() {
        return resposta8;
    }

    public void setResposta8(int resposta8) {
        this.resposta8 = resposta8;
    }

    public int getResposta9() {
        return resposta9;
    }

    public void setResposta9(int resposta9) {
        this.resposta9 = resposta9;
    }

    public int getResposta10() {
        return resposta10;
    }

    public void setResposta10(int resposta10) {
        this.resposta10 = resposta10;
    }

    public int getResposta11() {
        return resposta11;
    }

    public void setResposta11(int resposta11) {
        this.resposta11 = resposta11;
    }

    public int getResposta12() {
        return resposta12;
    }

    public void setResposta12(int resposta12) {
        this.resposta12 = resposta12;
    }

    public int getResposta13() {
        return resposta13;
    }

    public void setResposta13(int resposta13) {
        this.resposta13 = resposta13;
    }

    public int getResposta14() {
        return resposta14;
    }

    public void setResposta14(int resposta14) {
        this.resposta14 = resposta14;
    }

    public int getResposta15() {
        return resposta15;
    }

    public void setResposta15(int resposta15) {
        this.resposta15 = resposta15;
    }

    public int getResposta16() {
        return resposta16;
    }

    public void setResposta16(int resposta16) {
        this.resposta16 = resposta16;
    }

    public int getResposta17() {
        return resposta17;
    }

    public void setResposta17(int resposta17) {
        this.resposta17 = resposta17;
    }

    public int getResposta18() {
        return resposta18;
    }

    public void setResposta18(int resposta18) {
        this.resposta18 = resposta18;
    }

    public int getResposta19() {
        return resposta19;
    }

    public void setResposta19(int resposta19) {
        this.resposta19 = resposta19;
    }

    public int getResposta20() {
        return resposta20;
    }

    public void setResposta20(int resposta20) {
        this.resposta20 = resposta20;
    }
    
    public int getResposta(int questao){
        switch(questao){
            case 1:
                return resposta1;
            case 2:
                return resposta2;
            case 3:
                return resposta3;
            case 4:
                return resposta4;
            case 5:
                return resposta5;
            case 6:
                return resposta6;
            case 7:
                return resposta7;
            case 8:
                return resposta8;
            case 9:
                return resposta9;
            case 10:
                return resposta10;
            case 11:
                return resposta11;
            case 12:
                return resposta12;
            case 13:
                return resposta13;
            case 14:
                return resposta14;
            case 15:
                return resposta15;
            case 16:
                return resposta16;
            case 17:
                return resposta17;
            case 18:
                return resposta18;
            case 19:
                return resposta19;
            case 20:
                return resposta20;
            default:
                return 0;    
        }
    }
    
}
