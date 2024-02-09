package edu.eci.cvds.tdd.registry;
public class Registry {
    public RegisterResult registerVoter(Person p) {
        if (p.getAge() >= 120 || p.getAge() < 0){
            return RegisterResult.INVALID_AGE;
        } else if (p.getAge() < 18) {
            return RegisterResult.UNDERAGE;
        } else if (p.isAlive() == false) {
            return RegisterResult.DEAD;
        }
        return RegisterResult.VALID;
    }
}