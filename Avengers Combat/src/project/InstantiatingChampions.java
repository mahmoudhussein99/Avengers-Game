
package project;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import javafx.scene.image.ImageView;
import project.Champion;
import static project.HealthBar.logoCenterCrop;
/**
 *
 * @author HP
 */
//3.capmarvel
//5.dr strange
//6.hawkeye
//7.hulk
//ironman
//9.nebula
//10.spiderman
//thor
//winterso
//loki
//ultron
//thanos

 

public class InstantiatingChampions {
    
    public static String folderPath= "file:images\\";
    public Champion[] championsArray;
    Champion blackPanther;
    Champion blackWidow;
    Champion captainMarvel;
    Champion captainAmerica;
    Champion drStrange;
    Champion hawkeye;
    Champion hulk;
    Champion ironman;
    Champion nebula;
    Champion spiderman;
    Champion thor;
    Champion winterso;
    Champion loki;
    Champion ultron;
    Champion thanos;
    
    
    
    
    
    public InstantiatingChampions(){
        
        Champion[] championsArray= new Champion[15];
       
        

        double power =5;
        //intialize champions
        //1.black Panther
          blackPanther= new Champion ("Black Panther",power,1.5); 

        blackPanther.setAvatar(new ImageView(folderPath+"black panther logo.png"));
        //logoCenterCrop(blackPanther);
        ImageView fr1 = new ImageView(folderPath+"black panther facing right.png");       
        ImageView fl1 = new ImageView(folderPath+"black panther facing left.png");
        ImageView hr11 = new ImageView(folderPath+"black panther hit right 1.png");
        ImageView hr12 = new ImageView(folderPath+"black panther hit right 2.png");
        ImageView hr13 = new ImageView(folderPath+"black panther hit right 3.png");
        ImageView hl11 = new ImageView(folderPath+"black panther hit left 1.png");
        ImageView hl12 = new ImageView(folderPath+"black panther hit left 2.png");
        ImageView hl13 = new ImageView(folderPath+"black panther hit left 3.png");
        ImageView ghr1 = new ImageView(folderPath+"black panther getting hit from left.png");
        ImageView ghl1 = new ImageView(folderPath+"black panther getting hit from right.png");
        ImageView mr1 = new ImageView(folderPath+"black panther moving right 2.png");
        ImageView ml1 = new ImageView(folderPath+"black panther moving left 2.png");
        
        
        blackPanther.setAnimSkins(fr1, fl1, hr11, hr12, hr13, hl11, hl12, hl13,mr1,ml1,ghr1,ghl1);
        
        championsArray[0] = blackPanther;
        
          //2.BlackWidow
          blackWidow= new Champion ("Black Widow",power,1.5); 

        blackWidow.setAvatar(new ImageView(folderPath+"black widow logo.png"));
        ImageView fr2 = new ImageView(folderPath+"black widow facing right.png");
        ImageView fl2 = new ImageView(folderPath+"black widow facing left.png");
        ImageView hr21 = new ImageView(folderPath+"black widow hit right 1.png");
        ImageView hr22 = new ImageView(folderPath+"black widow hit right 2.png");
        ImageView hr23 = new ImageView(folderPath+"black widow hit right 3.png");
        ImageView hl21 = new ImageView(folderPath+"black widow hit left 1.png");
        ImageView hl22 = new ImageView(folderPath+"black widow hit left 2.png");
        ImageView hl23 = new ImageView(folderPath+"black widow hit left 3.png");
        ImageView ghr2 = new ImageView(folderPath+"black widow getting hit from left.png");
        ImageView ghl2 = new ImageView(folderPath+"black widow getting hit from right.png");
        ImageView mr2 = new ImageView(folderPath+"black widow moving right 2.png");
        ImageView ml2 = new ImageView(folderPath+"black widow moving left 2.png");
        
        
        blackWidow.setAnimSkins(fr2, fl2, hr21, hr22, hr23, hl21, hl22, hl23,mr2,ml2,ghr2,ghl2);

        championsArray[1] = blackWidow;
        
         //3.Captain Marvel
          captainMarvel= new Champion ("Captain Marvel",power,1.5); 

         captainMarvel.setAvatar(new ImageView(folderPath+"capmarvel logo.png"));
        ImageView fr3 = new ImageView(folderPath+"capmarvel facing right.png");
        ImageView fl3 = new ImageView(folderPath+"capmarvel facing left.png");
        ImageView hr31 = new ImageView(folderPath+"capmarvel hit right 1.png");
        ImageView hr32 = new ImageView(folderPath+"capmarvel hit right 2.png");
        ImageView hr33 = new ImageView(folderPath+"capmarvel hit right 3.png");
        ImageView hl31 = new ImageView(folderPath+"capmarvel hit left 1.png");
        ImageView hl32 = new ImageView(folderPath+"capmarvel hit left 2.png");
        ImageView hl33 = new ImageView(folderPath+"capmarvel hit left 3.png");
        ImageView ghr3 = new ImageView(folderPath+"capmarvel getting hit from left.png");
        ImageView ghl3 = new ImageView(folderPath+"capmarvel getting hit from right.png");
        ImageView mr3 = new ImageView(folderPath+"capmarvel moving right 2.png");
        ImageView ml3 = new ImageView(folderPath+"capmarvel moving left 2.png");
        
        
         captainMarvel.setAnimSkins(fr3, fl3, hr31, hr32, hr33, hl31, hl32, hl33,mr3,ml3,ghr3,ghl3);
        
        championsArray[2] = captainMarvel;
        
        
        //4.CaptainAmerica
         captainAmerica= new Champion ("captain america",power,1.5); 

        captainAmerica.setAvatar(new ImageView(folderPath+"captain logo.png"));
        ImageView fr4 = new ImageView(folderPath+"captain facing right.png");
        ImageView fl4 = new ImageView(folderPath+"captain facing left.png");
        ImageView hr41 = new ImageView(folderPath+"captain hit right 1.png");
        ImageView hr42 = new ImageView(folderPath+"captain hit right 2.png");
        ImageView hr43 = new ImageView(folderPath+"captain hit right 3.png");
        ImageView hl41 = new ImageView(folderPath+"captain hit left 1.png");
        ImageView hl42= new ImageView(folderPath+"captain hit left 2.png");
        ImageView hl43= new ImageView(folderPath+"captain hit left 3.png");
        ImageView ghr4= new ImageView(folderPath+"captain getting hit from left.png");
        ImageView ghl4= new ImageView(folderPath+"captain getting hit from right.png");
        ImageView mr4 = new ImageView(folderPath+"captain moving right 2.png");
        ImageView ml4= new ImageView(folderPath+"captain moving left 2.png");
        
        
        captainAmerica.setAnimSkins(fr4, fl4, hr41, hr42, hr43, hl41, hl42, hl43,mr4,ml4,ghr4,ghl4);
        
        championsArray[3] = captainAmerica;
        
           //5.Doctor Strange
          drStrange= new Champion ("Doctor Strange",power,1.5); 

         drStrange.setAvatar(new ImageView(folderPath+"dr strange logo.png"));
        ImageView fr5 = new ImageView(folderPath+"dr strange facing right.png");
        ImageView fl5 = new ImageView(folderPath+"dr strange facing left.png");
        ImageView hr51 = new ImageView(folderPath+"dr strange hit right 1.png");
        ImageView hr52 = new ImageView(folderPath+"dr strange hit right 2.png");
        ImageView hr53 = new ImageView(folderPath+"dr strange hit right 3.png");
        ImageView hl51 = new ImageView(folderPath+"dr strange hit left 1.png");
        ImageView hl52 = new ImageView(folderPath+"dr strange hit left 2.png");
        ImageView hl53 = new ImageView(folderPath+"dr strange hit left 3.png");
        ImageView ghr5 = new ImageView(folderPath+"dr strange getting hit from left.png");
        ImageView ghl5 = new ImageView(folderPath+"dr strange getting hit from right.png");
        ImageView mr5= new ImageView(folderPath+"dr strange moving right 2.png");
        ImageView ml5 = new ImageView(folderPath+"dr strange moving left 2.png");
        
        
         drStrange.setAnimSkins(fr5, fl5, hr51, hr52, hr53, hl51, hl52, hl53,mr5,ml5,ghr5,ghl5);
        
        championsArray[4] =drStrange; 
        
              //6.Hawkeye
          hawkeye= new Champion ("Hawkeye",power,1.5); 

         hawkeye.setAvatar(new ImageView(folderPath+"hawkeye logo.png"));
        ImageView fr6 = new ImageView(folderPath+"hawkeye facing right.png");
        ImageView fl6 = new ImageView(folderPath+"hawkeye facing left.png");
        ImageView hr61 = new ImageView(folderPath+"hawkeye hit right 1.png");
        ImageView hr62 = new ImageView(folderPath+"hawkeye hit right 2.png");
        ImageView hr63 = new ImageView(folderPath+"hawkeye hit right 3.png");
        ImageView hl61 = new ImageView(folderPath+"hawkeye hit left 1.png");
        ImageView hl62 = new ImageView(folderPath+"hawkeye hit left 2.png");
        ImageView hl63 = new ImageView(folderPath+"hawkeye hit left 3.png");
        ImageView ghr6 = new ImageView(folderPath+"hawkeye getting hit from left.png");
        ImageView ghl6 = new ImageView(folderPath+"hawkeye getting hit from right.png");
        ImageView mr6= new ImageView(folderPath+"hawkeye moving right 2.png");
        ImageView ml6 = new ImageView(folderPath+"hawkeye moving left 2.png");
        
        
         hawkeye.setAnimSkins(fr6, fl6, hr61, hr62, hr63, hl61, hl62, hl63,mr6,ml6,ghr6,ghl6);
         
         hawkeye.getFacingLeft().setY(BattlePane.bounds.getMaxY()*6.5/14);
        hawkeye.getFacingRight().setY(BattlePane.bounds.getMaxY()*6.5/14);
        championsArray[5] = hawkeye; 
        
              //7.hulk
          hulk= new Champion ("Hulk",power,1.5); 

         hulk.setAvatar(new ImageView(folderPath+"hulk logo.png"));
        ImageView fr7 = new ImageView(folderPath+"hulk facing right.png");
        ImageView fl7 = new ImageView(folderPath+"hulk facing left.png");
        ImageView hr71 = new ImageView(folderPath+"hulk hit right 1.png");
        ImageView hr72 = new ImageView(folderPath+"hulk hit right 2.png");
        ImageView hr73 = new ImageView(folderPath+"hulk hit right 3.png");
        ImageView hl71 = new ImageView(folderPath+"hulk hit left 1.png");
        ImageView hl72 = new ImageView(folderPath+"hulk hit left 2.png");
        ImageView hl73 = new ImageView(folderPath+"hulk hit left 3.png");
        ImageView ghr7 = new ImageView(folderPath+"hulk getting hit from left.png");
        ImageView ghl7 = new ImageView(folderPath+"hulk getting hit from right.png");
        ImageView mr7= new ImageView(folderPath+"hulk moving right 2.png");
        ImageView ml7 = new ImageView(folderPath+"hulk moving left 2.png");
        
        
         hulk.setAnimSkins(fr7, fl7, hr71, hr72, hr73, hl71, hl72, hl73,mr7,ml7,ghr7,ghl7);
        
        championsArray[6] = hulk; 
        
        
        
         //8.Ironman
          ironman= new Champion ("Ironman",power,1.5); 

         ironman.setAvatar(new ImageView(folderPath+"iron man logo.png"));
        ImageView fr8 = new ImageView(folderPath+"iron man facing right.png");
        ImageView fl8 = new ImageView(folderPath+"iron man facing left.png");
        ImageView hr81 = new ImageView(folderPath+"iron man hit right 1.png");
        ImageView hr82 = new ImageView(folderPath+"iron man hit right 2.png");
        ImageView hr83 = new ImageView(folderPath+"iron man hit right 3.png");
        ImageView hl81 = new ImageView(folderPath+"iron man hit left 1.png");
        ImageView hl82 = new ImageView(folderPath+"iron man hit left 2.png");
        ImageView hl83 = new ImageView(folderPath+"iron man hit left 3.png");
        ImageView ghr8 = new ImageView(folderPath+"iron man getting hit from left.png");
        ImageView ghl8 = new ImageView(folderPath+"iron man getting hit from right.png");
        ImageView mr8= new ImageView(folderPath+"iron man moving right 2.png");
        ImageView ml8 = new ImageView(folderPath+"iron man moving left 2.png");
        
        
         ironman.setAnimSkins(fr8, fl8, hr81, hr82, hr83, hl81, hl82, hl83,mr8,ml8,ghr8,ghl8);
        
        championsArray[7] = ironman; 
        
        
          //9.Nebula
         nebula= new Champion ("Nebula",power,1.5); 

        nebula.setAvatar(new ImageView(folderPath+"nebula logo.png"));
        ImageView fr9 = new ImageView(folderPath+"nebula facing right.png");
        ImageView fl9 = new ImageView(folderPath+"nebula facing left.png");
        ImageView hr91 = new ImageView(folderPath+"nebula hit right 1.png");
        ImageView hr92 = new ImageView(folderPath+"nebula hit right 2.png");
        ImageView hr93 = new ImageView(folderPath+"nebula hit right 3.png");
        ImageView hl91 = new ImageView(folderPath+"nebula hit left 1.png");
        ImageView hl92 = new ImageView(folderPath+"nebula hit left 2.png");
        ImageView hl93 = new ImageView(folderPath+"nebula hit left 3.png");
        ImageView ghr9 = new ImageView(folderPath+"nebula getting hit from left.png");
        ImageView ghl9 = new ImageView(folderPath+"nebula getting hit from right.png");
        ImageView mr9= new ImageView(folderPath+"nebula moving right 2.png");
        ImageView ml9 = new ImageView(folderPath+"nebula moving left 2.png");
        
        
         nebula.setAnimSkins(fr9, fl9, hr91, hr92, hr93, hl91, hl92, hl93,mr9,ml9,ghr9,ghl9);
        
        championsArray[8] = nebula; 
        
        
        
        
        //10.Spiderman
         spiderman= new Champion ("Spiderman",power,1.5); 

        spiderman.setAvatar(new ImageView(folderPath+"spiderman logo.png"));
        ImageView fr10 = new ImageView(folderPath+"spiderman facing right.png");
        ImageView fl10= new ImageView(folderPath+"spiderman facing left.png");
        ImageView hr101 = new ImageView(folderPath+"spiderman hit right 1.png");
        ImageView hr102 = new ImageView(folderPath+"spiderman hit right 2.png");
        ImageView hr103 = new ImageView(folderPath+"spiderman hit right 3.png");
        ImageView hl101 = new ImageView(folderPath+"spiderman hit left 1.png");
        ImageView hl102 = new ImageView(folderPath+"spiderman hit left 2.png");
        ImageView hl103 = new ImageView(folderPath+"spiderman hit left 3.png");
        ImageView ghr10 = new ImageView(folderPath+"spiderman getting hit from left.png");
        ImageView ghl10 = new ImageView(folderPath+"spiderman getting hit from right.png");
        ImageView mr10= new ImageView(folderPath+"spiderman moving right 2.png");
        ImageView ml10 = new ImageView(folderPath+"spiderman moving left 2.png");
        
        
         spiderman.setAnimSkins(fr10, fl10, hr101, hr102, hr103, hl101, hl102, hl103,mr10,ml10,ghr10,ghl10);
        
        championsArray[9] = spiderman; 
        
        
        
         //11.thor
         thor= new Champion ("Thor",power,1.5); 

        thor.setAvatar(new ImageView(folderPath+"thor logo.png"));
        ImageView fr11 = new ImageView(folderPath+"thor facing right.png");
        ImageView fl11= new ImageView(folderPath+"thor facing left.png");
        ImageView hr111 = new ImageView(folderPath+"thor hit right 1.png");
        ImageView hr112 = new ImageView(folderPath+"thor hit right 2.png");
        ImageView hr113 = new ImageView(folderPath+"thor hit right 3.png");
        ImageView hl111 = new ImageView(folderPath+"thor hit left 1.png");
        ImageView hl112 = new ImageView(folderPath+"thor hit left 2.png");
        ImageView hl113 = new ImageView(folderPath+"thor hit left 3.png");
        ImageView ghr11 = new ImageView(folderPath+"thor getting hit from left.png");
        ImageView ghl11 = new ImageView(folderPath+"thor getting hit from right.png");
        ImageView mr11= new ImageView(folderPath+"thor moving right 2.png");
        ImageView ml11 = new ImageView(folderPath+"thor moving left 2.png");
        
        
         thor.setAnimSkins(fr11, fl11, hr111, hr112, hr113, hl111, hl112, hl113,mr11,ml11,ghr11,ghl11);
        
        championsArray[10] = thor; 
        
        
          //12.Winter Solider
         winterso= new Champion ("Winter Solider",power,1.5); 

        winterso.setAvatar(new ImageView(folderPath+"winterso logo.png"));
        ImageView fr12 = new ImageView(folderPath+"winterso facing right.png");
        ImageView fl12= new ImageView(folderPath+"winterso facing left.png");
        ImageView hr121 = new ImageView(folderPath+"winterso hit right 1.png");
        ImageView hr122 = new ImageView(folderPath+"winterso hit right 2.png");
        ImageView hr123 = new ImageView(folderPath+"winterso hit right 3.png");
        ImageView hl121 = new ImageView(folderPath+"winterso hit left 1.png");
        ImageView hl122 = new ImageView(folderPath+"winterso hit left 2.png");
        ImageView hl123 = new ImageView(folderPath+"winterso hit left 3.png");
        ImageView ghr12 = new ImageView(folderPath+"winterso getting hit from left.png");
        ImageView ghl12 = new ImageView(folderPath+"winterso getting hit from right.png");
        ImageView mr12= new ImageView(folderPath+"winterso moving right 2.png");
        ImageView ml12 = new ImageView(folderPath+"winterso moving left 2.png");
        
        
         winterso.setAnimSkins(fr12, fl12, hr121, hr122, hr123, hl121, hl122, hl123,mr12,ml12,ghr12,ghl12);
        
        championsArray[11] = winterso; 
      

        //13.loki
         loki= new Champion ("Loki",power,1.5); 

        loki.setAvatar(new ImageView(folderPath+"loki logo.png"));
        ImageView fr13 = new ImageView(folderPath+"loki facing right.png");
        ImageView fl13= new ImageView(folderPath+"loki facing left.png");
        ImageView hr131 = new ImageView(folderPath+"loki hit right 1.png");
        ImageView hr132 = new ImageView(folderPath+"loki hit right 2.png");
        ImageView hr133 = new ImageView(folderPath+"loki hit right 3.png");
        ImageView hl131 = new ImageView(folderPath+"loki hit left 1.png");
        ImageView hl132 = new ImageView(folderPath+"loki hit left 2.png");
        ImageView hl133 = new ImageView(folderPath+"loki hit left 3.png");
        ImageView ghr13 = new ImageView(folderPath+"loki getting hit from left.png");
        ImageView ghl13 = new ImageView(folderPath+"loki getting hit from right.png");
        ImageView mr13= new ImageView(folderPath+"loki moving right 2.png");
        ImageView ml13 = new ImageView(folderPath+"loki moving left 2.png");
        
        
         loki.setAnimSkins(fr13, fl13, hr131, hr132, hr133, hl131, hl132, hl133,mr13,ml13,ghr13,ghl13);
        
        championsArray[12] = loki; 
         
        
        //14.Ultron
         ultron= new Champion ("Ultron",power,1.5); 

        ultron.setAvatar(new ImageView(folderPath+"ultron logo.png"));
        ImageView fr14 = new ImageView(folderPath+"ultron facing right.png");
        ImageView fl14= new ImageView(folderPath+"ultron facing left.png");
        ImageView hr141 = new ImageView(folderPath+"ultron hit right 1.png");
        ImageView hr142 = new ImageView(folderPath+"ultron hit right 2.png");
        ImageView hr143 = new ImageView(folderPath+"ultron hit right 3.png");
        ImageView hl141 = new ImageView(folderPath+"ultron hit left 1.png");
        ImageView hl142 = new ImageView(folderPath+"ultron hit left 2.png");
        ImageView hl143 = new ImageView(folderPath+"ultron hit left 3.png");
        ImageView ghr14 = new ImageView(folderPath+"ultron getting hit from left.png");
        ImageView ghl14 = new ImageView(folderPath+"ultron getting hit from right.png");
        ImageView mr14= new ImageView(folderPath+"ultron moving right 2.png");
        ImageView ml14 = new ImageView(folderPath+"ultron moving left 2.png");
        
        
         ultron.setAnimSkins(fr14, fl14, hr141, hr142, hr143, hl141, hl142, hl143,mr14,ml14,ghr14,ghl14);
        
        championsArray[13] = ultron; 
        
        
        //15.Thanos
         thanos= new Champion ("Thanos",power,1.5); 

        thanos.setAvatar(new ImageView(folderPath+"thanos logo.png"));
        ImageView fr15 = new ImageView(folderPath+"thanos facing right.png");
        ImageView fl15= new ImageView(folderPath+"thanos facing left.png");
        ImageView hr151 = new ImageView(folderPath+"thanos hit right 1.png");
        ImageView hr152 = new ImageView(folderPath+"thanos hit right 2.png");
        ImageView hr153 = new ImageView(folderPath+"thanos hit right 3.png");
        ImageView hl151 = new ImageView(folderPath+"thanos hit left 1.png");
        ImageView hl152 = new ImageView(folderPath+"thanos hit left 2.png");
        ImageView hl153 = new ImageView(folderPath+"thanos hit left 3.png");
        ImageView ghr15 = new ImageView(folderPath+"thanos getting hit from left.png");
        ImageView ghl15 = new ImageView(folderPath+"thanos getting hit from right.png");
        ImageView mr15= new ImageView(folderPath+"thanos moving right 2.png");
        ImageView ml15 = new ImageView(folderPath+"thanos moving left 2.png");
        
        
         thanos.setAnimSkins(fr15, fl15, hr151, hr152, hr153, hl151, hl152, hl153,mr15,ml15,ghr15,ghl15);
        
        championsArray[14] = thanos;
        
         
        
        
    }

    public Champion[] getChampionsArray() {
        return championsArray;
    }

    public Champion getChampion(int n) {
        
        switch(n){
            case 0: return blackPanther;
    
            case 1:    return blackWidow;
            
            case 2: return captainMarvel;
            case 3: return captainAmerica;
            case 4: return drStrange;
            case 5 : return hawkeye;
            case 6: return hulk;
            case 7: return ironman;
            case 8: return nebula;
            case 9: return spiderman;
            case 10: return thor;
            case 11: return winterso;
            case 12: return loki;
            case 13: return ultron;
            case 14: return thanos;
            default: return null;
        }
    }
    
    
   
   
}