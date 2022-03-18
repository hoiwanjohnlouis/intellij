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
import com.hwtsllc.fixengine2022.datatypes.TagTypeAbstract;
import com.hwtsllc.fixengine2022.fix27.enums.Enum18ExecInst;

public class Tag18ExecInst extends TagTypeAbstract {
    private final Enum18ExecInst dataValue;

    public final static Enum18ExecInst TESTA_EXEC_INST = Enum18ExecInst.STAY_ON_OFFER_SIDE; // fake data
    public final static Enum18ExecInst TESTB_EXEC_INST = Enum18ExecInst.STAY_ON_BID_SIDE;

    public Tag18ExecInst(Enum18ExecInst dataValue) {
        setFixType(FIXType.FIX18_EXEC_INST);
        setDataValue(dataValue.getID());
        this.dataValue = dataValue;
    }

    /**
     *
     * @param args      Not used.
     */
    public static void main(String[] args) {
        Tag18ExecInst tagData = new Tag18ExecInst(TESTA_EXEC_INST);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());
    }
}
