/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.netbeans.core.actions;

import org.openide.util.HelpCtx;
import org.openide.util.NbBundle;
import org.openide.util.actions.CallbackSystemAction;

/** The action which invoke next "jump" getLine in output window (like next error)
*
* @author Petr Hamernik
*/
public class JumpNextAction extends CallbackSystemAction {

    protected void initialize() {
        super.initialize();
        setSurviveFocusChange(true);
        putProperty ("noIconInMenu", Boolean.TRUE); // NOI18N
    }

    protected String iconResource () {
        return "org/netbeans/core/resources/actions/nextOutJump.gif"; // NOI18N
    }

    public HelpCtx getHelpCtx() {
        return new HelpCtx (JumpNextAction.class);
    }

    public String getName() {
        return NbBundle.getBundle(JumpNextAction.class).getString("JumpNextAction");
    }
    
    protected boolean asynchronous() {
        return false;
    }
    
    public void setActionPerformer (org.openide.util.actions.ActionPerformer performer) {
        throw new java.lang.UnsupportedOperationException ();
    }
    public Object getActionMapKey () {
        return "jumpNext"; // NOI18N
    }
}
