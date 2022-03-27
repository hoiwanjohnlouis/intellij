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

class Enum321SecurityRequestTypeTest {
    @Test
    void Enum0321Test() {
        Enum321SecurityRequestType enumType;

        /*
         * 0-3 msg types
         */
        enumType = Enum321SecurityRequestType.REQUEST_SECURITY_IDENTITY;
        enumType = Enum321SecurityRequestType.REQUEST_SPECIFIED_SECURITY;
        enumType = Enum321SecurityRequestType.REQUEST_LIST_SECURITY_TYPES;
        enumType = Enum321SecurityRequestType.REQUEST_LIST_SECURITIES;
    }
    /**
     *
     */
    public static void main(String[] args) {
        System.out.println();
    }
}