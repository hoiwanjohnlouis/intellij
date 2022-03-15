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

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.*;

class Enum373SessionRejectReasonTest {
    private final String WHERE_AM_I = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @BeforeAll
    static void beforeAll() {
    }

    @AfterAll
    static void afterAll() {
    }

    @Test
    void Enum0373Test() {
        Enum373SessionRejectReason enumType;

        /*
         * 0-17, 99 msg types
         */
        enumType = Enum373SessionRejectReason.INVALID_TAG_NUMBER;
        enumType = Enum373SessionRejectReason.REQUIRED_TAG_MISSING;
        enumType = Enum373SessionRejectReason.TAG_NOT_DEFINED_FOR_THIS_MESSAGE_TYPE;
        enumType = Enum373SessionRejectReason.UNDEFINED_TAG;
        enumType = Enum373SessionRejectReason.TAG_SPECIFIED_WITHOUT_A_VALUE;
        enumType = Enum373SessionRejectReason.INCORRECT_VALUE_FOR_THIS_TAG;
        enumType = Enum373SessionRejectReason.INCORRECT_DATA_FORMAT;
        enumType = Enum373SessionRejectReason.DECRYPTION_PROBLEM;
        enumType = Enum373SessionRejectReason.SIGNATURE_PROBLEM;
        enumType = Enum373SessionRejectReason.COMPID_PROBLEM;
        enumType = Enum373SessionRejectReason.SENDINGTIME_ACCURACY_PROBLEM;
        enumType = Enum373SessionRejectReason.INVALID_MSGTYPE;
        enumType = Enum373SessionRejectReason.XML_VALIDATION_ERROR;
        enumType = Enum373SessionRejectReason.DUPLICATE_TAG;
        enumType = Enum373SessionRejectReason.TAG_SPECIFIED_OUT_OF_ORDER;
        enumType = Enum373SessionRejectReason.REPEATING_GROUP_FIELDS_OUT_OF_ORDER;
        enumType = Enum373SessionRejectReason.INCORRECT_NUMINGROUP_COUNT;
        enumType = Enum373SessionRejectReason.VALUE_INCLUDES_FIELD_DELIMITER;

        enumType = Enum373SessionRejectReason.OTHER;
    }
    /**
     *
     */
    public static void main(String[] args) {
        System.out.println();
    }
}