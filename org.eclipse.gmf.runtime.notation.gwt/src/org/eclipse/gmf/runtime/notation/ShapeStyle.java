/******************************************************************************
 * Copyright (c) 2004, 2010 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    IBM Corporation - initial API and implementation 
 ****************************************************************************/

package org.eclipse.gmf.runtime.notation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shape Style</b></em>'.
 * <p>
 * A shape style is a typical style to be installed on shape nodes that 
 * own a description (like note shapes). It gives the node fill, line, 
 * font and description style properties 
 * </p>
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getShapeStyle()
 * @model
 * @generated
 * @noimplement This interface is not intended to be implemented by clients.
 */
/*
 * @canBeSeenBy %partners
 */
public interface ShapeStyle extends FontStyle, DescriptionStyle, FillStyle, LineStyle, RoundedCornersStyle {
	// no default API
} // ShapeStyle
