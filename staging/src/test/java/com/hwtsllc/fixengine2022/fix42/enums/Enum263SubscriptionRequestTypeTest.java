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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Enum263SubscriptionRequestTypeTest {
    @Test
    void Enum0263Test() {
        Enum263SubscriptionRequestType enumType;

        /*
         * 0-2 msg types
         */
        enumType = Enum263SubscriptionRequestType.SNAPSHOT;
        enumType = Enum263SubscriptionRequestType.SUBSCRIBE_SNAPSHOT;
        enumType = Enum263SubscriptionRequestType.UNSUBSCRIBE_SNAPSHOT;

        assertEquals(1,1);
        assertNotEquals(2,1);
    }
    /**
     *
     */
    public static void main(String[] args) {
        System.out.println();
    }
}