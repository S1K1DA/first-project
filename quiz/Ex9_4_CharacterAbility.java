package kr.co.quiz;

public class Ex9_4_CharacterAbility {
	
	
	
	private int str;
    private int dex;
    private int knowledge;
    private int level = 1;
    private int experience = 0;
    private int hp = 100;
    private int mp = 100;
    
    public void CharacterAbility() {
    	this.str = str;
    	this.dex = dex;
    	this.knowledge = knowledge;
    }

    public int getStr() {
        return str;
    }
    public int getDex() {
    	return dex;
    }
    public int getKnowledge() {
    	return knowledge;
    }
    public int getLevel() {
    	return level;
    }
    public int getHp() {
    	return hp;
    }
    public int getMp() {
    	return mp;
    }
    public int getExperience() {
    	
    	return experience;
    }


    public void setStr(int str) {
    	this.str = str;
    }
    public void setDex(int dex) {
        this.dex = dex;
    }
    public void setKnowledge(int knowledge) {
    	this.knowledge = knowledge;
    }
    public void setMp(int mp) {
    	if(this.mp>0) {  // �Ű�����
   		 this.mp=  this.mp - mp;
   	}
    }
    public void setHp(int hp) {
    	if(this.hp>0) {  // �Ű�����
    		 this.hp=  this.hp - hp;
    	}
    }
    public void setLevel(int level) {
    	this.level = this.level;
    }
    public void setExperience(int experience) { //90
    	if(this.experience+experience < 100) { // 90 < 100
    		this.experience = this.experience + experience;
    	} else if(this.experience+experience >= 100) {
    		this.level++;
    		this.experience = this.experience+experience - 100;
    		if(this.str >= 50) {
        		this.str = this.str + 5;
        	} else if(this.dex >= 50) {
        		this.dex=this.dex+5;
        	} else if(this.knowledge >=50) {
        		this.knowledge = this.knowledge+5;
        	}
    	} 
    }
    
    }

//    public void experience(int experience) {
//    	if(experience >= 100) {
//    		level++;
//    	    experience = 0;
//    	}
    




//2. CharacterAbility Ŭ���� ����
//-> str(��)
//-> dex(��ø)
//-> knowledge(����)
//-> level(����, �ʱⰪ 1)
//-> experience(����ġ, 100�� �� ��� ������ 1 �����ϰ� ����ġ�� 0�� �˴ϴ�.)
//-> hp(ü��, �ʱⰪ 100, ������ �ص� ȸ�� �ȉ�)
//-> mp(����, �ʱⰪ 100, ������ �ص� ȸ�� �ȉ�)
//-> ��, ��� ������ ���������ڴ� private