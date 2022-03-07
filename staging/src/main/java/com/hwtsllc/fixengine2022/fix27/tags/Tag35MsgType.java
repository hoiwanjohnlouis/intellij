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

package com.hwtsllc.fixengine2022.fix27.tags;

import com.hwtsllc.fixengine2022.datatypes.FIXType;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public enum Tag35MsgType {

    HEARTBEAT("0", "Heartbeat"),
    TEST_REQUEST("1", "Test Request"),
    RESEND_REQUEST("2", "Resend Request"),
    REJECT("3", "Reject"),
    SEQUENCE_RESET("4", "Sequence Reset"),
    LOGOUT("5", "Logout"),
    EXECUTION_REPORT("8", "Execution Report"),
    ORDER_CANCEL_REJECT("9", "Order Cancel Reject"),
    NEW_ORDER("D", "New Order - Single"),
    ORDER_CANCEL_REQUEST("F", "Order Cancel Request"),
    ORDER_MODIFICATION_REQUEST("G", "Order Cancel/Replace Request"),
    ORDER_STATUS_REQUEST("H", "Order Status Request"),
    ;
    private final String DEBUG_TAG = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    private final FIXType fixType = FIXType.FIX35_MSG_TYPE;

    private final String tag35MsgTypeValue;
    private final String tag35MsgTypeDescription;

    Tag35MsgType(final String msgType, final String msgDescription) {
        this.tag35MsgTypeValue = msgType;
        this.tag35MsgTypeDescription = msgDescription;
    }

    public String getTag35MsgTypeValue() {
        return tag35MsgTypeValue;
    }
    public String getTag35MsgTypeDescription() {
        return tag35MsgTypeDescription;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.name());
        sb.append(":[");
        sb.append(getTag35MsgTypeValue());
        sb.append("]");
        sb.append(":[");
        sb.append(getTag35MsgTypeDescription());
        sb.append("]");

        return sb.toString();
    }

}
