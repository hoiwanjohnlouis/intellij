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

// The concrete builder class that assembles the parts
// of the finished Robot object

public class OldRobotBuilder implements RobotBuilder {

    private Robot robot;

    public OldRobotBuilder() {

        this.robot = new Robot();

    }

    public void buildRobotHead() {

        robot.setRobotHead("Tin Head");

    }

    public void buildRobotTorso() {

        robot.setRobotTorso("Tin Torso");

    }

    public void buildRobotArms() {

        robot.setRobotArms("Blowtorch Arms");

    }

    public void buildRobotLegs() {

        robot.setRobotLegs("Rollar Skates");

    }

    public Robot getRobot() {

        return this.robot;
    }



}

