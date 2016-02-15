package com.ntt2015.builderpattern;

/*
    Copyright (c) 2014  HW Tech Services, Inc., LLC
 
    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at
 
        http://www.apache.org/licenses/LICENSE-2.0
 
    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
*/

// The concrete Robot class based on the RobotPlan interface

public class Robot implements RobotPlan{

    private String robotHead;
    private String robotTorso;
    private String robotArms;
    private String robotLegs;

    public void setRobotHead(String head) {

        robotHead = head;

    }

    public String getRobotHead(){ return robotHead; }


    public void setRobotTorso(String torso) {

        robotTorso = torso;

    }

    public String getRobotTorso(){ return robotTorso; }


    public void setRobotArms(String arms) {

        robotArms = arms;

    }

    public String getRobotArms(){ return robotArms; }


    public void setRobotLegs(String legs) {

        robotLegs = legs;

    }

    public String getRobotLegs(){ return robotLegs; }



}
