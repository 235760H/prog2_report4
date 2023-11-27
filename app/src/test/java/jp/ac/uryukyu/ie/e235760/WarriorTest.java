package jp.ac.uryukyu.ie.e235760;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WarriorTest {
    int beforeHp;
    int warriorAttack = 6;
    int damage;
    Warrior warrior = new Warrior("デモ戦士", 100, warriorAttack );
    Enemy slime = new Enemy("スライムもどき", 100, 5);

    int attackDamege(){
        beforeHp = slime.getHitPoint();
        warrior.attackWithWeponSkill(slime);
        damage = beforeHp - slime.getHitPoint();
        return damage;
    }

    void attackTest(){
        for(int i = 0;i<3;i++){
            assertEquals((int)(warriorAttack * 1.5), damage);
        }   
    }
}

