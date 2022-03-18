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
import com.hwtsllc.fixengine2022.fix27.enums.Enum21HandlInst;

public class Tag21HandlInst extends TagTypeAbstract {
    private Enum21HandlInst dataValue;

    public final static Enum21HandlInst TESTA_HANDL_INST = Enum21HandlInst.AUTOMATIC_EXECUTION_NO_BROKER; // fake data
    public final static Enum21HandlInst TESTB_HANDL_INST = Enum21HandlInst.AUTOMATIC_EXECUTION_BROKER_OKAY;

    public Tag21HandlInst(Enum21HandlInst dataValue) {
        setFixType(FIXType.FIX21_HANDL_INST);
        setDataValue(dataValue.getID());
        this.dataValue = dataValue;
    }

    /**
     *
     * @param args      Not used.
     */
    public static void main(String[] args) {
        Tag21HandlInst tagData = new Tag21HandlInst(TESTA_HANDL_INST);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());
    }
}
