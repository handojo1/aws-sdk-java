/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies an item to be retrieved as part of the transaction.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/TransactGetItem" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TransactGetItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Contains the primary key that identifies the item to get, together with the name of the table that contains the
     * item, and optionally the specific attributes of the item to retrieve.
     * </p>
     */
    private Get get;

    /**
     * <p>
     * Contains the primary key that identifies the item to get, together with the name of the table that contains the
     * item, and optionally the specific attributes of the item to retrieve.
     * </p>
     * 
     * @param get
     *        Contains the primary key that identifies the item to get, together with the name of the table that
     *        contains the item, and optionally the specific attributes of the item to retrieve.
     */

    public void setGet(Get get) {
        this.get = get;
    }

    /**
     * <p>
     * Contains the primary key that identifies the item to get, together with the name of the table that contains the
     * item, and optionally the specific attributes of the item to retrieve.
     * </p>
     * 
     * @return Contains the primary key that identifies the item to get, together with the name of the table that
     *         contains the item, and optionally the specific attributes of the item to retrieve.
     */

    public Get getGet() {
        return this.get;
    }

    /**
     * <p>
     * Contains the primary key that identifies the item to get, together with the name of the table that contains the
     * item, and optionally the specific attributes of the item to retrieve.
     * </p>
     * 
     * @param get
     *        Contains the primary key that identifies the item to get, together with the name of the table that
     *        contains the item, and optionally the specific attributes of the item to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransactGetItem withGet(Get get) {
        setGet(get);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getGet() != null)
            sb.append("Get: ").append(getGet());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TransactGetItem == false)
            return false;
        TransactGetItem other = (TransactGetItem) obj;
        if (other.getGet() == null ^ this.getGet() == null)
            return false;
        if (other.getGet() != null && other.getGet().equals(this.getGet()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGet() == null) ? 0 : getGet().hashCode());
        return hashCode;
    }

    @Override
    public TransactGetItem clone() {
        try {
            return (TransactGetItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dynamodbv2.model.transform.TransactGetItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
