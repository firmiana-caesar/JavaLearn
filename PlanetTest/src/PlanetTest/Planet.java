package PlanetTest;

/*
public class PLanet {
}
*/
public class Planet {

    public double xxPos;
    public double yyPos;
    public double xxVel;
    public double yyVel;
    public double mass;
    public String imgFileName;

    //定义一个Planet p
    public Planet (double xP, double yP, double xV,double yV, double m, String img) {

        xxPos = xP;
        yyPos = yP;
        xxVel = xV;
        yyVel = yV;
        mass = m;
        imgFileName = img;
    }

    //创建一个Planet p 的副本
    public Planet(Planet p) {

        //Planet pCopy = new
        // Planet(p.xxPos, p.yyPos, p.xxVel, p.yyVel, p.mass, p.imgFileName);
        this (p.xxPos, p.yyPos, p.xxVel, p.yyVel, p.mass, p.imgFileName);
        xxPos = p.xxPos;
        yyPos = p.yyPos;
        xxVel = p.xxVel;
        yyVel = p.yyVel;
        mass = p.mass;
        imgFileName = p.imgFileName;



    }
}