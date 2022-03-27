/*
 * Copyright (c) 2022.  HW Tech Services, LLC
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package com.hwtsllc.fixengine2022.fix42.enums;

import org.junit.jupiter.api.*;

class Enum433ListExecInstTypeTest {
    @Test
    void Enum0433Test() {
        Enum433ListExecInstType enumType;

        /*
         * 1-5 msg types
         */
        enumType = Enum433ListExecInstType.IMMEDIATE;
        enumType = Enum433ListExecInstType.WAIT_FOR_EXECUTION_INSTRUCTION;
        enumType = Enum433ListExecInstType.SELL_DRIVEN;
        enumType = Enum433ListExecInstType.BUY_DRIVEN_CASH_TOP_UP;
        enumType = Enum433ListExecInstType.BUY_DRIVEN_CASH_WITHDRAW;
    }
    /**
     *
     */
    public static void main(String[] args) {
        System.out.println();
    }
}