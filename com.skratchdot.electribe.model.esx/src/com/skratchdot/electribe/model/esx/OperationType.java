/**
 * Copyright (c) 2009, 2012 SKRATCHDOT.COM
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *     JEFF |:at:| SKRATCHDOT |:dot:| COM
 *
 * $Id$
 */
package com.skratchdot.electribe.model.esx;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Operation Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.skratchdot.electribe.model.esx.EsxPackage#getOperationType()
 * @model
 * @generated
 */
public enum OperationType implements Enumerator {
	/**
	 * The '<em><b>OP UNKNOWN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OP_UNKNOWN_VALUE
	 * @generated
	 * @ordered
	 */
	OP_UNKNOWN(0, "OP_UNKNOWN", "Unknown"),

	/**
	 * The '<em><b>OP 004</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OP_004_VALUE
	 * @generated
	 * @ordered
	 */
	OP_004(4, "OP_004", "Drum1 Pitch"), /**
										* The '<em><b>OP 005</b></em>' literal object.
										* <!-- begin-user-doc -->
										* <!-- end-user-doc -->
										* @see #OP_005_VALUE
										* @generated
										* @ordered
										*/
	OP_005(5, "OP_005", "Drum1 Filter Type"), /**
												* The '<em><b>OP 006</b></em>' literal object.
												* <!-- begin-user-doc -->
												* <!-- end-user-doc -->
												* @see #OP_006_VALUE
												* @generated
												* @ordered
												*/
	OP_006(6, "OP_006", "Drum1 Filter Cutoff"), /**
												* The '<em><b>OP 007</b></em>' literal object.
												* <!-- begin-user-doc -->
												* <!-- end-user-doc -->
												* @see #OP_007_VALUE
												* @generated
												* @ordered
												*/
	OP_007(7, "OP_007", "Drum1 Filter Resonance"), /**
													* The '<em><b>OP 008</b></em>' literal object.
													* <!-- begin-user-doc -->
													* <!-- end-user-doc -->
													* @see #OP_008_VALUE
													* @generated
													* @ordered
													*/
	OP_008(8, "OP_008", "Drum1 Filter EG Int"), /**
												* The '<em><b>OP 009</b></em>' literal object.
												* <!-- begin-user-doc -->
												* <!-- end-user-doc -->
												* @see #OP_009_VALUE
												* @generated
												* @ordered
												*/
	OP_009(9, "OP_009", "Drum1 Start Point"), /**
												* The '<em><b>OP 00A</b></em>' literal object.
												* <!-- begin-user-doc -->
												* <!-- end-user-doc -->
												* @see #OP_00A_VALUE
												* @generated
												* @ordered
												*/
	OP_00A(10, "OP_00A", "Drum1 Level"), /**
											* The '<em><b>OP 00B</b></em>' literal object.
											* <!-- begin-user-doc -->
											* <!-- end-user-doc -->
											* @see #OP_00B_VALUE
											* @generated
											* @ordered
											*/
	OP_00B(11, "OP_00B", "Drum1 Pan"), /**
										* The '<em><b>OP 00C</b></em>' literal object.
										* <!-- begin-user-doc -->
										* <!-- end-user-doc -->
										* @see #OP_00C_VALUE
										* @generated
										* @ordered
										*/
	OP_00C(12, "OP_00C", "Drum1 EG Time"), /**
											* The '<em><b>OP 00D</b></em>' literal object.
											* <!-- begin-user-doc -->
											* <!-- end-user-doc -->
											* @see #OP_00D_VALUE
											* @generated
											* @ordered
											*/
	OP_00D(13, "OP_00D", "Drum1 Amp EG"), /**
											* The '<em><b>OP 00E</b></em>' literal object.
											* <!-- begin-user-doc -->
											* <!-- end-user-doc -->
											* @see #OP_00E_VALUE
											* @generated
											* @ordered
											*/
	OP_00E(14, "OP_00E", "Drum1 Roll"), /**
										* The '<em><b>OP 00F</b></em>' literal object.
										* <!-- begin-user-doc -->
										* <!-- end-user-doc -->
										* @see #OP_00F_VALUE
										* @generated
										* @ordered
										*/
	OP_00F(15, "OP_00F", "Drum1 Reverse"), /**
											* The '<em><b>OP 010</b></em>' literal object.
											* <!-- begin-user-doc -->
											* <!-- end-user-doc -->
											* @see #OP_010_VALUE
											* @generated
											* @ordered
											*/
	OP_010(16, "OP_010", "Drum1 Effect Send"), /**
												* The '<em><b>OP 011</b></em>' literal object.
												* <!-- begin-user-doc -->
												* <!-- end-user-doc -->
												* @see #OP_011_VALUE
												* @generated
												* @ordered
												*/
	OP_011(17, "OP_011", "Drum1 Effect Select"), /**
													* The '<em><b>OP 012</b></em>' literal object.
													* <!-- begin-user-doc -->
													* <!-- end-user-doc -->
													* @see #OP_012_VALUE
													* @generated
													* @ordered
													*/
	OP_012(18, "OP_012", "Drum1 Modulation Type"), /**
													* The '<em><b>OP 013</b></em>' literal object.
													* <!-- begin-user-doc -->
													* <!-- end-user-doc -->
													* @see #OP_013_VALUE
													* @generated
													* @ordered
													*/
	OP_013(19, "OP_013", "Drum1 Modulation Depth"), /**
													* The '<em><b>OP 014</b></em>' literal object.
													* <!-- begin-user-doc -->
													* <!-- end-user-doc -->
													* @see #OP_014_VALUE
													* @generated
													* @ordered
													*/
	OP_014(20, "OP_014", "Drum1 Modulation Speed"), /**
													* The '<em><b>OP 015</b></em>' literal object.
													* <!-- begin-user-doc -->
													* <!-- end-user-doc -->
													* @see #OP_015_VALUE
													* @generated
													* @ordered
													*/
	OP_015(21, "OP_015", "Drum1 Modulation Destination"), /**
															* The '<em><b>OP 016</b></em>' literal object.
															* <!-- begin-user-doc -->
															* <!-- end-user-doc -->
															* @see #OP_016_VALUE
															* @generated
															* @ordered
															*/
	OP_016(22, "OP_016", "Drum1 Modulation BPM Sync"), /**
														* The '<em><b>OP 017</b></em>' literal object.
														* <!-- begin-user-doc -->
														* <!-- end-user-doc -->
														* @see #OP_017_VALUE
														* @generated
														* @ordered
														*/
	OP_017(23, "OP_017", "Drum1 Motion Seq Type"), /**
													* The '<em><b>OP 024</b></em>' literal object.
													* <!-- begin-user-doc -->
													* <!-- end-user-doc -->
													* @see #OP_024_VALUE
													* @generated
													* @ordered
													*/
	OP_024(36, "OP_024", "Drum2 Pitch"), /**
											* The '<em><b>OP 025</b></em>' literal object.
											* <!-- begin-user-doc -->
											* <!-- end-user-doc -->
											* @see #OP_025_VALUE
											* @generated
											* @ordered
											*/
	OP_025(37, "OP_025", "Drum2 Filter Type"), /**
												* The '<em><b>OP 026</b></em>' literal object.
												* <!-- begin-user-doc -->
												* <!-- end-user-doc -->
												* @see #OP_026_VALUE
												* @generated
												* @ordered
												*/
	OP_026(38, "OP_026", "Drum2 Filter Cutoff"), /**
													* The '<em><b>OP 027</b></em>' literal object.
													* <!-- begin-user-doc -->
													* <!-- end-user-doc -->
													* @see #OP_027_VALUE
													* @generated
													* @ordered
													*/
	OP_027(39, "OP_027", "Drum2 Filter Resonance"), /**
													* The '<em><b>OP 028</b></em>' literal object.
													* <!-- begin-user-doc -->
													* <!-- end-user-doc -->
													* @see #OP_028_VALUE
													* @generated
													* @ordered
													*/
	OP_028(40, "OP_028", "Drum2 Filter EG Int"), /**
													* The '<em><b>OP 029</b></em>' literal object.
													* <!-- begin-user-doc -->
													* <!-- end-user-doc -->
													* @see #OP_029_VALUE
													* @generated
													* @ordered
													*/
	OP_029(41, "OP_029", "Drum2 Start Point"), /**
												* The '<em><b>OP 02A</b></em>' literal object.
												* <!-- begin-user-doc -->
												* <!-- end-user-doc -->
												* @see #OP_02A_VALUE
												* @generated
												* @ordered
												*/
	OP_02A(42, "OP_02A", "Drum2 Level"), /**
											* The '<em><b>OP 02B</b></em>' literal object.
											* <!-- begin-user-doc -->
											* <!-- end-user-doc -->
											* @see #OP_02B_VALUE
											* @generated
											* @ordered
											*/
	OP_02B(43, "OP_02B", "Drum2 Pan"), /**
										* The '<em><b>OP 02C</b></em>' literal object.
										* <!-- begin-user-doc -->
										* <!-- end-user-doc -->
										* @see #OP_02C_VALUE
										* @generated
										* @ordered
										*/
	OP_02C(44, "OP_02C", "Drum2 EG Time"), /**
											* The '<em><b>OP 02D</b></em>' literal object.
											* <!-- begin-user-doc -->
											* <!-- end-user-doc -->
											* @see #OP_02D_VALUE
											* @generated
											* @ordered
											*/
	OP_02D(45, "OP_02D", "Drum2 Amp EG"), /**
											* The '<em><b>OP 02E</b></em>' literal object.
											* <!-- begin-user-doc -->
											* <!-- end-user-doc -->
											* @see #OP_02E_VALUE
											* @generated
											* @ordered
											*/
	OP_02E(46, "OP_02E", "Drum2 Roll"), /**
										* The '<em><b>OP 02F</b></em>' literal object.
										* <!-- begin-user-doc -->
										* <!-- end-user-doc -->
										* @see #OP_02F_VALUE
										* @generated
										* @ordered
										*/
	OP_02F(47, "OP_02F", "Drum2 Reverse"), /**
											* The '<em><b>OP 030</b></em>' literal object.
											* <!-- begin-user-doc -->
											* <!-- end-user-doc -->
											* @see #OP_030_VALUE
											* @generated
											* @ordered
											*/
	OP_030(48, "OP_030", "Drum2 Effect Send"), /**
												* The '<em><b>OP 031</b></em>' literal object.
												* <!-- begin-user-doc -->
												* <!-- end-user-doc -->
												* @see #OP_031_VALUE
												* @generated
												* @ordered
												*/
	OP_031(49, "OP_031", "Drum2 Effect Select"), /**
													* The '<em><b>OP 032</b></em>' literal object.
													* <!-- begin-user-doc -->
													* <!-- end-user-doc -->
													* @see #OP_032_VALUE
													* @generated
													* @ordered
													*/
	OP_032(50, "OP_032", "Drum2 Modulation Type"), /**
													* The '<em><b>OP 033</b></em>' literal object.
													* <!-- begin-user-doc -->
													* <!-- end-user-doc -->
													* @see #OP_033_VALUE
													* @generated
													* @ordered
													*/
	OP_033(51, "OP_033", "Drum2 Modulation Depth"), /**
													* The '<em><b>OP 034</b></em>' literal object.
													* <!-- begin-user-doc -->
													* <!-- end-user-doc -->
													* @see #OP_034_VALUE
													* @generated
													* @ordered
													*/
	OP_034(52, "OP_034", "Drum2 Modulation Speed"), /**
													* The '<em><b>OP 035</b></em>' literal object.
													* <!-- begin-user-doc -->
													* <!-- end-user-doc -->
													* @see #OP_035_VALUE
													* @generated
													* @ordered
													*/
	OP_035(53, "OP_035", "Drum2 Modulation Destination"), /**
															* The '<em><b>OP 036</b></em>' literal object.
															* <!-- begin-user-doc -->
															* <!-- end-user-doc -->
															* @see #OP_036_VALUE
															* @generated
															* @ordered
															*/
	OP_036(54, "OP_036", "Drum2 Modulation BPM Sync"), /**
														* The '<em><b>OP 037</b></em>' literal object.
														* <!-- begin-user-doc -->
														* <!-- end-user-doc -->
														* @see #OP_037_VALUE
														* @generated
														* @ordered
														*/
	OP_037(55, "OP_037", "Drum2 Motion Seq Type"), /**
													* The '<em><b>OP 044</b></em>' literal object.
													* <!-- begin-user-doc -->
													* <!-- end-user-doc -->
													* @see #OP_044_VALUE
													* @generated
													* @ordered
													*/
	OP_044(68, "OP_044", "Drum3 Pitch"), /**
											* The '<em><b>OP 045</b></em>' literal object.
											* <!-- begin-user-doc -->
											* <!-- end-user-doc -->
											* @see #OP_045_VALUE
											* @generated
											* @ordered
											*/
	OP_045(69, "OP_045", "Drum3 Filter Type"), /**
												* The '<em><b>OP 046</b></em>' literal object.
												* <!-- begin-user-doc -->
												* <!-- end-user-doc -->
												* @see #OP_046_VALUE
												* @generated
												* @ordered
												*/
	OP_046(70, "OP_046", "Drum3 Filter Cutoff"), /**
													* The '<em><b>OP 047</b></em>' literal object.
													* <!-- begin-user-doc -->
													* <!-- end-user-doc -->
													* @see #OP_047_VALUE
													* @generated
													* @ordered
													*/
	OP_047(71, "OP_047", "Drum3 Filter Resonance"), /**
													* The '<em><b>OP 048</b></em>' literal object.
													* <!-- begin-user-doc -->
													* <!-- end-user-doc -->
													* @see #OP_048_VALUE
													* @generated
													* @ordered
													*/
	OP_048(72, "OP_048", "Drum3 Filter EG Int"), /**
													* The '<em><b>OP 049</b></em>' literal object.
													* <!-- begin-user-doc -->
													* <!-- end-user-doc -->
													* @see #OP_049_VALUE
													* @generated
													* @ordered
													*/
	OP_049(73, "OP_049", "Drum3 Start Point"), /**
												* The '<em><b>OP 04A</b></em>' literal object.
												* <!-- begin-user-doc -->
												* <!-- end-user-doc -->
												* @see #OP_04A_VALUE
												* @generated
												* @ordered
												*/
	OP_04A(74, "OP_04A", "Drum3 Level"), /**
											* The '<em><b>OP 04B</b></em>' literal object.
											* <!-- begin-user-doc -->
											* <!-- end-user-doc -->
											* @see #OP_04B_VALUE
											* @generated
											* @ordered
											*/
	OP_04B(75, "OP_04B", "Drum3 Pan"), /**
										* The '<em><b>OP 04C</b></em>' literal object.
										* <!-- begin-user-doc -->
										* <!-- end-user-doc -->
										* @see #OP_04C_VALUE
										* @generated
										* @ordered
										*/
	OP_04C(76, "OP_04C", "Drum3 EG Time"), /**
											* The '<em><b>OP 04D</b></em>' literal object.
											* <!-- begin-user-doc -->
											* <!-- end-user-doc -->
											* @see #OP_04D_VALUE
											* @generated
											* @ordered
											*/
	OP_04D(77, "OP_04D", "Drum3 Amp EG"), /**
											* The '<em><b>OP 04E</b></em>' literal object.
											* <!-- begin-user-doc -->
											* <!-- end-user-doc -->
											* @see #OP_04E_VALUE
											* @generated
											* @ordered
											*/
	OP_04E(78, "OP_04E", "Drum3 Roll"), /**
										* The '<em><b>OP 04F</b></em>' literal object.
										* <!-- begin-user-doc -->
										* <!-- end-user-doc -->
										* @see #OP_04F_VALUE
										* @generated
										* @ordered
										*/
	OP_04F(79, "OP_04F", "Drum3 Reverse"), /**
											* The '<em><b>OP 050</b></em>' literal object.
											* <!-- begin-user-doc -->
											* <!-- end-user-doc -->
											* @see #OP_050_VALUE
											* @generated
											* @ordered
											*/
	OP_050(80, "OP_050", "Drum3 Effect Send"), /**
												* The '<em><b>OP 051</b></em>' literal object.
												* <!-- begin-user-doc -->
												* <!-- end-user-doc -->
												* @see #OP_051_VALUE
												* @generated
												* @ordered
												*/
	OP_051(81, "OP_051", "Drum3 Effect Select"), /**
													* The '<em><b>OP 052</b></em>' literal object.
													* <!-- begin-user-doc -->
													* <!-- end-user-doc -->
													* @see #OP_052_VALUE
													* @generated
													* @ordered
													*/
	OP_052(82, "OP_052", "Drum3 Modulation Type"), /**
													* The '<em><b>OP 053</b></em>' literal object.
													* <!-- begin-user-doc -->
													* <!-- end-user-doc -->
													* @see #OP_053_VALUE
													* @generated
													* @ordered
													*/
	OP_053(83, "OP_053", "Drum3 Modulation Depth"), /**
													* The '<em><b>OP 054</b></em>' literal object.
													* <!-- begin-user-doc -->
													* <!-- end-user-doc -->
													* @see #OP_054_VALUE
													* @generated
													* @ordered
													*/
	OP_054(84, "OP_054", "Drum3 Modulation Speed"), /**
													* The '<em><b>OP 055</b></em>' literal object.
													* <!-- begin-user-doc -->
													* <!-- end-user-doc -->
													* @see #OP_055_VALUE
													* @generated
													* @ordered
													*/
	OP_055(85, "OP_055", "Drum3 Modulation Destination"), /**
															* The '<em><b>OP 056</b></em>' literal object.
															* <!-- begin-user-doc -->
															* <!-- end-user-doc -->
															* @see #OP_056_VALUE
															* @generated
															* @ordered
															*/
	OP_056(86, "OP_056", "Drum3 Modulation BPM Sync"), /**
														* The '<em><b>OP 057</b></em>' literal object.
														* <!-- begin-user-doc -->
														* <!-- end-user-doc -->
														* @see #OP_057_VALUE
														* @generated
														* @ordered
														*/
	OP_057(87, "OP_057", "Drum3 Motion Seq Type"), /**
													* The '<em><b>OP 064</b></em>' literal object.
													* <!-- begin-user-doc -->
													* <!-- end-user-doc -->
													* @see #OP_064_VALUE
													* @generated
													* @ordered
													*/
	OP_064(100, "OP_064", "Drum4 Pitch"), /**
											* The '<em><b>OP 065</b></em>' literal object.
											* <!-- begin-user-doc -->
											* <!-- end-user-doc -->
											* @see #OP_065_VALUE
											* @generated
											* @ordered
											*/
	OP_065(101, "OP_065", "Drum4 Filter Type"), /**
												* The '<em><b>OP 066</b></em>' literal object.
												* <!-- begin-user-doc -->
												* <!-- end-user-doc -->
												* @see #OP_066_VALUE
												* @generated
												* @ordered
												*/
	OP_066(102, "OP_066", "Drum4 Filter Cutoff"), /**
													* The '<em><b>OP 067</b></em>' literal object.
													* <!-- begin-user-doc -->
													* <!-- end-user-doc -->
													* @see #OP_067_VALUE
													* @generated
													* @ordered
													*/
	OP_067(103, "OP_067", "Drum4 Filter Resonance"), /**
														* The '<em><b>OP 068</b></em>' literal object.
														* <!-- begin-user-doc -->
														* <!-- end-user-doc -->
														* @see #OP_068_VALUE
														* @generated
														* @ordered
														*/
	OP_068(104, "OP_068", "Drum4 Filter EG Int"), /**
													* The '<em><b>OP 069</b></em>' literal object.
													* <!-- begin-user-doc -->
													* <!-- end-user-doc -->
													* @see #OP_069_VALUE
													* @generated
													* @ordered
													*/
	OP_069(105, "OP_069", "Drum4 Start Point"), /**
												* The '<em><b>OP 06A</b></em>' literal object.
												* <!-- begin-user-doc -->
												* <!-- end-user-doc -->
												* @see #OP_06A_VALUE
												* @generated
												* @ordered
												*/
	OP_06A(106, "OP_06A", "Drum4 Level"), /**
											* The '<em><b>OP 06B</b></em>' literal object.
											* <!-- begin-user-doc -->
											* <!-- end-user-doc -->
											* @see #OP_06B_VALUE
											* @generated
											* @ordered
											*/
	OP_06B(107, "OP_06B", "Drum4 Pan"), /**
										* The '<em><b>OP 06C</b></em>' literal object.
										* <!-- begin-user-doc -->
										* <!-- end-user-doc -->
										* @see #OP_06C_VALUE
										* @generated
										* @ordered
										*/
	OP_06C(108, "OP_06C", "Drum4 EG Time"), /**
											* The '<em><b>OP 06D</b></em>' literal object.
											* <!-- begin-user-doc -->
											* <!-- end-user-doc -->
											* @see #OP_06D_VALUE
											* @generated
											* @ordered
											*/
	OP_06D(109, "OP_06D", "Drum4 Amp EG"), /**
											* The '<em><b>OP 06E</b></em>' literal object.
											* <!-- begin-user-doc -->
											* <!-- end-user-doc -->
											* @see #OP_06E_VALUE
											* @generated
											* @ordered
											*/
	OP_06E(110, "OP_06E", "Drum4 Roll"), /**
											* The '<em><b>OP 06F</b></em>' literal object.
											* <!-- begin-user-doc -->
											* <!-- end-user-doc -->
											* @see #OP_06F_VALUE
											* @generated
											* @ordered
											*/
	OP_06F(111, "OP_06F", "Drum4 Reverse"), /**
											* The '<em><b>OP 070</b></em>' literal object.
											* <!-- begin-user-doc -->
											* <!-- end-user-doc -->
											* @see #OP_070_VALUE
											* @generated
											* @ordered
											*/
	OP_070(112, "OP_070", "Drum4 Effect Send"), /**
												* The '<em><b>OP 071</b></em>' literal object.
												* <!-- begin-user-doc -->
												* <!-- end-user-doc -->
												* @see #OP_071_VALUE
												* @generated
												* @ordered
												*/
	OP_071(113, "OP_071", "Drum4 Effect Select"), /**
													* The '<em><b>OP 072</b></em>' literal object.
													* <!-- begin-user-doc -->
													* <!-- end-user-doc -->
													* @see #OP_072_VALUE
													* @generated
													* @ordered
													*/
	OP_072(114, "OP_072", "Drum4 Modulation Type"), /**
													* The '<em><b>OP 073</b></em>' literal object.
													* <!-- begin-user-doc -->
													* <!-- end-user-doc -->
													* @see #OP_073_VALUE
													* @generated
													* @ordered
													*/
	OP_073(115, "OP_073", "Drum4 Modulation Depth"), /**
														* The '<em><b>OP 074</b></em>' literal object.
														* <!-- begin-user-doc -->
														* <!-- end-user-doc -->
														* @see #OP_074_VALUE
														* @generated
														* @ordered
														*/
	OP_074(116, "OP_074", "Drum4 Modulation Speed"), /**
														* The '<em><b>OP 075</b></em>' literal object.
														* <!-- begin-user-doc -->
														* <!-- end-user-doc -->
														* @see #OP_075_VALUE
														* @generated
														* @ordered
														*/
	OP_075(117, "OP_075", "Drum4 Modulation Destination"), /**
															* The '<em><b>OP 076</b></em>' literal object.
															* <!-- begin-user-doc -->
															* <!-- end-user-doc -->
															* @see #OP_076_VALUE
															* @generated
															* @ordered
															*/
	OP_076(118, "OP_076", "Drum4 Modulation BPM Sync"), /**
														* The '<em><b>OP 077</b></em>' literal object.
														* <!-- begin-user-doc -->
														* <!-- end-user-doc -->
														* @see #OP_077_VALUE
														* @generated
														* @ordered
														*/
	OP_077(119, "OP_077", "Drum4 Motion Seq Type"), /**
													* The '<em><b>OP 084</b></em>' literal object.
													* <!-- begin-user-doc -->
													* <!-- end-user-doc -->
													* @see #OP_084_VALUE
													* @generated
													* @ordered
													*/
	OP_084(132, "OP_084", "Drum5 Pitch"), /**
											* The '<em><b>OP 085</b></em>' literal object.
											* <!-- begin-user-doc -->
											* <!-- end-user-doc -->
											* @see #OP_085_VALUE
											* @generated
											* @ordered
											*/
	OP_085(133, "OP_085", "Drum5 Filter Type"), /**
												* The '<em><b>OP 086</b></em>' literal object.
												* <!-- begin-user-doc -->
												* <!-- end-user-doc -->
												* @see #OP_086_VALUE
												* @generated
												* @ordered
												*/
	OP_086(134, "OP_086", "Drum5 Filter Cutoff"), /**
													* The '<em><b>OP 087</b></em>' literal object.
													* <!-- begin-user-doc -->
													* <!-- end-user-doc -->
													* @see #OP_087_VALUE
													* @generated
													* @ordered
													*/
	OP_087(135, "OP_087", "Drum5 Filter Resonance"), /**
														* The '<em><b>OP 088</b></em>' literal object.
														* <!-- begin-user-doc -->
														* <!-- end-user-doc -->
														* @see #OP_088_VALUE
														* @generated
														* @ordered
														*/
	OP_088(136, "OP_088", "Drum5 Filter EG Int"), /**
													* The '<em><b>OP 089</b></em>' literal object.
													* <!-- begin-user-doc -->
													* <!-- end-user-doc -->
													* @see #OP_089_VALUE
													* @generated
													* @ordered
													*/
	OP_089(137, "OP_089", "Drum5 Start Point"), /**
												* The '<em><b>OP 08A</b></em>' literal object.
												* <!-- begin-user-doc -->
												* <!-- end-user-doc -->
												* @see #OP_08A_VALUE
												* @generated
												* @ordered
												*/
	OP_08A(138, "OP_08A", "Drum5 Level"), /**
											* The '<em><b>OP 08B</b></em>' literal object.
											* <!-- begin-user-doc -->
											* <!-- end-user-doc -->
											* @see #OP_08B_VALUE
											* @generated
											* @ordered
											*/
	OP_08B(139, "OP_08B", "Drum5 Pan"), /**
										* The '<em><b>OP 08C</b></em>' literal object.
										* <!-- begin-user-doc -->
										* <!-- end-user-doc -->
										* @see #OP_08C_VALUE
										* @generated
										* @ordered
										*/
	OP_08C(140, "OP_08C", "Drum5 EG Time"), /**
											* The '<em><b>OP 08D</b></em>' literal object.
											* <!-- begin-user-doc -->
											* <!-- end-user-doc -->
											* @see #OP_08D_VALUE
											* @generated
											* @ordered
											*/
	OP_08D(141, "OP_08D", "Drum5 Amp EG"), /**
											* The '<em><b>OP 08E</b></em>' literal object.
											* <!-- begin-user-doc -->
											* <!-- end-user-doc -->
											* @see #OP_08E_VALUE
											* @generated
											* @ordered
											*/
	OP_08E(142, "OP_08E", "Drum5 Roll"), /**
											* The '<em><b>OP 08F</b></em>' literal object.
											* <!-- begin-user-doc -->
											* <!-- end-user-doc -->
											* @see #OP_08F_VALUE
											* @generated
											* @ordered
											*/
	OP_08F(143, "OP_08F", "Drum5 Reverse"), /**
											* The '<em><b>OP 090</b></em>' literal object.
											* <!-- begin-user-doc -->
											* <!-- end-user-doc -->
											* @see #OP_090_VALUE
											* @generated
											* @ordered
											*/
	OP_090(144, "OP_090", "Drum5 Effect Send"), /**
												* The '<em><b>OP 091</b></em>' literal object.
												* <!-- begin-user-doc -->
												* <!-- end-user-doc -->
												* @see #OP_091_VALUE
												* @generated
												* @ordered
												*/
	OP_091(145, "OP_091", "Drum5 Effect Select"), /**
													* The '<em><b>OP 092</b></em>' literal object.
													* <!-- begin-user-doc -->
													* <!-- end-user-doc -->
													* @see #OP_092_VALUE
													* @generated
													* @ordered
													*/
	OP_092(146, "OP_092", "Drum5 Modulation Type"), /**
													* The '<em><b>OP 093</b></em>' literal object.
													* <!-- begin-user-doc -->
													* <!-- end-user-doc -->
													* @see #OP_093_VALUE
													* @generated
													* @ordered
													*/
	OP_093(147, "OP_093", "Drum5 Modulation Depth"), /**
														* The '<em><b>OP 094</b></em>' literal object.
														* <!-- begin-user-doc -->
														* <!-- end-user-doc -->
														* @see #OP_094_VALUE
														* @generated
														* @ordered
														*/
	OP_094(148, "OP_094", "Drum5 Modulation Speed"), /**
														* The '<em><b>OP 095</b></em>' literal object.
														* <!-- begin-user-doc -->
														* <!-- end-user-doc -->
														* @see #OP_095_VALUE
														* @generated
														* @ordered
														*/
	OP_095(149, "OP_095", "Drum5 Modulation Destination"), /**
															* The '<em><b>OP 096</b></em>' literal object.
															* <!-- begin-user-doc -->
															* <!-- end-user-doc -->
															* @see #OP_096_VALUE
															* @generated
															* @ordered
															*/
	OP_096(150, "OP_096", "Drum5 Modulation BPM Sync"), /**
														* The '<em><b>OP 097</b></em>' literal object.
														* <!-- begin-user-doc -->
														* <!-- end-user-doc -->
														* @see #OP_097_VALUE
														* @generated
														* @ordered
														*/
	OP_097(151, "OP_097", "Drum5 Motion Seq Type"), /**
													* The '<em><b>OP 0A4</b></em>' literal object.
													* <!-- begin-user-doc -->
													* <!-- end-user-doc -->
													* @see #OP_0A4_VALUE
													* @generated
													* @ordered
													*/
	OP_0A4(164, "OP_0A4", "Drum6A Pitch"), /**
											* The '<em><b>OP 0A5</b></em>' literal object.
											* <!-- begin-user-doc -->
											* <!-- end-user-doc -->
											* @see #OP_0A5_VALUE
											* @generated
											* @ordered
											*/
	OP_0A5(165, "OP_0A5", "Drum6A Filter Type"), /**
													* The '<em><b>OP 0A6</b></em>' literal object.
													* <!-- begin-user-doc -->
													* <!-- end-user-doc -->
													* @see #OP_0A6_VALUE
													* @generated
													* @ordered
													*/
	OP_0A6(166, "OP_0A6", "Drum6A Filter Cutoff"), /**
													* The '<em><b>OP 0A7</b></em>' literal object.
													* <!-- begin-user-doc -->
													* <!-- end-user-doc -->
													* @see #OP_0A7_VALUE
													* @generated
													* @ordered
													*/
	OP_0A7(167, "OP_0A7", "Drum6A Filter Resonance"), /**
														* The '<em><b>OP 0A8</b></em>' literal object.
														* <!-- begin-user-doc -->
														* <!-- end-user-doc -->
														* @see #OP_0A8_VALUE
														* @generated
														* @ordered
														*/
	OP_0A8(168, "OP_0A8", "Drum6A Filter EG Int"), /**
													* The '<em><b>OP 0A9</b></em>' literal object.
													* <!-- begin-user-doc -->
													* <!-- end-user-doc -->
													* @see #OP_0A9_VALUE
													* @generated
													* @ordered
													*/
	OP_0A9(169, "OP_0A9", "Drum6A Start Point"), /**
													* The '<em><b>OP 0AA</b></em>' literal object.
													* <!-- begin-user-doc -->
													* <!-- end-user-doc -->
													* @see #OP_0AA_VALUE
													* @generated
													* @ordered
													*/
	OP_0AA(170, "OP_0AA", "Drum6A Level"), /**
											* The '<em><b>OP 0AB</b></em>' literal object.
											* <!-- begin-user-doc -->
											* <!-- end-user-doc -->
											* @see #OP_0AB_VALUE
											* @generated
											* @ordered
											*/
	OP_0AB(171, "OP_0AB", "Drum6A Pan"), /**
											* The '<em><b>OP 0AC</b></em>' literal object.
											* <!-- begin-user-doc -->
											* <!-- end-user-doc -->
											* @see #OP_0AC_VALUE
											* @generated
											* @ordered
											*/
	OP_0AC(172, "OP_0AC", "Drum6A EG Time"), /**
												* The '<em><b>OP 0AD</b></em>' literal object.
												* <!-- begin-user-doc -->
												* <!-- end-user-doc -->
												* @see #OP_0AD_VALUE
												* @generated
												* @ordered
												*/
	OP_0AD(173, "OP_0AD", "Drum6A Amp EG"), /**
											* The '<em><b>OP 0AE</b></em>' literal object.
											* <!-- begin-user-doc -->
											* <!-- end-user-doc -->
											* @see #OP_0AE_VALUE
											* @generated
											* @ordered
											*/
	OP_0AE(174, "OP_0AE", "Drum6A Roll"), /**
											* The '<em><b>OP 0AF</b></em>' literal object.
											* <!-- begin-user-doc -->
											* <!-- end-user-doc -->
											* @see #OP_0AF_VALUE
											* @generated
											* @ordered
											*/
	OP_0AF(175, "OP_0AF", "Drum6A Reverse"), /**
												* The '<em><b>OP 0B0</b></em>' literal object.
												* <!-- begin-user-doc -->
												* <!-- end-user-doc -->
												* @see #OP_0B0_VALUE
												* @generated
												* @ordered
												*/
	OP_0B0(176, "OP_0B0", "Drum6A Effect Send"), /**
													* The '<em><b>OP 0B1</b></em>' literal object.
													* <!-- begin-user-doc -->
													* <!-- end-user-doc -->
													* @see #OP_0B1_VALUE
													* @generated
													* @ordered
													*/
	OP_0B1(177, "OP_0B1", "Drum6A Effect Select"), /**
													* The '<em><b>OP 0B2</b></em>' literal object.
													* <!-- begin-user-doc -->
													* <!-- end-user-doc -->
													* @see #OP_0B2_VALUE
													* @generated
													* @ordered
													*/
	OP_0B2(178, "OP_0B2", "Drum6A Modulation Type"), /**
														* The '<em><b>OP 0B3</b></em>' literal object.
														* <!-- begin-user-doc -->
														* <!-- end-user-doc -->
														* @see #OP_0B3_VALUE
														* @generated
														* @ordered
														*/
	OP_0B3(179, "OP_0B3", "Drum6A Modulation Depth"), /**
														* The '<em><b>OP 0B4</b></em>' literal object.
														* <!-- begin-user-doc -->
														* <!-- end-user-doc -->
														* @see #OP_0B4_VALUE
														* @generated
														* @ordered
														*/
	OP_0B4(180, "OP_0B4", "Drum6A Modulation Speed"), /**
														* The '<em><b>OP 0B5</b></em>' literal object.
														* <!-- begin-user-doc -->
														* <!-- end-user-doc -->
														* @see #OP_0B5_VALUE
														* @generated
														* @ordered
														*/
	OP_0B5(181, "OP_0B5", "Drum6A Modulation Destination"), /**
															* The '<em><b>OP 0B6</b></em>' literal object.
															* <!-- begin-user-doc -->
															* <!-- end-user-doc -->
															* @see #OP_0B6_VALUE
															* @generated
															* @ordered
															*/
	OP_0B6(182, "OP_0B6", "Drum6A Modulation BPM Sync"), /**
															* The '<em><b>OP 0B7</b></em>' literal object.
															* <!-- begin-user-doc -->
															* <!-- end-user-doc -->
															* @see #OP_0B7_VALUE
															* @generated
															* @ordered
															*/
	OP_0B7(183, "OP_0B7", "Drum6A Motion Seq Type"), /**
														* The '<em><b>OP 0C4</b></em>' literal object.
														* <!-- begin-user-doc -->
														* <!-- end-user-doc -->
														* @see #OP_0C4_VALUE
														* @generated
														* @ordered
														*/
	OP_0C4(196, "OP_0C4", "Drum6B Pitch"), /**
											* The '<em><b>OP 0C5</b></em>' literal object.
											* <!-- begin-user-doc -->
											* <!-- end-user-doc -->
											* @see #OP_0C5_VALUE
											* @generated
											* @ordered
											*/
	OP_0C5(197, "OP_0C5", "Drum6B Filter Type"), /**
													* The '<em><b>OP 0C6</b></em>' literal object.
													* <!-- begin-user-doc -->
													* <!-- end-user-doc -->
													* @see #OP_0C6_VALUE
													* @generated
													* @ordered
													*/
	OP_0C6(198, "OP_0C6", "Drum6B Filter Cutoff"), /**
													* The '<em><b>OP 0C7</b></em>' literal object.
													* <!-- begin-user-doc -->
													* <!-- end-user-doc -->
													* @see #OP_0C7_VALUE
													* @generated
													* @ordered
													*/
	OP_0C7(199, "OP_0C7", "Drum6B Filter Resonance"), /**
														* The '<em><b>OP 0C8</b></em>' literal object.
														* <!-- begin-user-doc -->
														* <!-- end-user-doc -->
														* @see #OP_0C8_VALUE
														* @generated
														* @ordered
														*/
	OP_0C8(200, "OP_0C8", "Drum6B Filter EG Int"), /**
													* The '<em><b>OP 0C9</b></em>' literal object.
													* <!-- begin-user-doc -->
													* <!-- end-user-doc -->
													* @see #OP_0C9_VALUE
													* @generated
													* @ordered
													*/
	OP_0C9(201, "OP_0C9", "Drum6B Start Point"), /**
													* The '<em><b>OP 0CA</b></em>' literal object.
													* <!-- begin-user-doc -->
													* <!-- end-user-doc -->
													* @see #OP_0CA_VALUE
													* @generated
													* @ordered
													*/
	OP_0CA(202, "OP_0CA", "Drum6B Level"), /**
											* The '<em><b>OP 0CB</b></em>' literal object.
											* <!-- begin-user-doc -->
											* <!-- end-user-doc -->
											* @see #OP_0CB_VALUE
											* @generated
											* @ordered
											*/
	OP_0CB(203, "OP_0CB", "Drum6B Pan"), /**
											* The '<em><b>OP 0CC</b></em>' literal object.
											* <!-- begin-user-doc -->
											* <!-- end-user-doc -->
											* @see #OP_0CC_VALUE
											* @generated
											* @ordered
											*/
	OP_0CC(204, "OP_0CC", "Drum6B EG Time"), /**
												* The '<em><b>OP 0CD</b></em>' literal object.
												* <!-- begin-user-doc -->
												* <!-- end-user-doc -->
												* @see #OP_0CD_VALUE
												* @generated
												* @ordered
												*/
	OP_0CD(205, "OP_0CD", "Drum6B Amp EG"), /**
											* The '<em><b>OP 0CE</b></em>' literal object.
											* <!-- begin-user-doc -->
											* <!-- end-user-doc -->
											* @see #OP_0CE_VALUE
											* @generated
											* @ordered
											*/
	OP_0CE(206, "OP_0CE", "Drum6B Roll"), /**
											* The '<em><b>OP 0CF</b></em>' literal object.
											* <!-- begin-user-doc -->
											* <!-- end-user-doc -->
											* @see #OP_0CF_VALUE
											* @generated
											* @ordered
											*/
	OP_0CF(207, "OP_0CF", "Drum6B Reverse"), /**
												* The '<em><b>OP 0D0</b></em>' literal object.
												* <!-- begin-user-doc -->
												* <!-- end-user-doc -->
												* @see #OP_0D0_VALUE
												* @generated
												* @ordered
												*/
	OP_0D0(208, "OP_0D0", "Drum6B Effect Send"), /**
													* The '<em><b>OP 0D1</b></em>' literal object.
													* <!-- begin-user-doc -->
													* <!-- end-user-doc -->
													* @see #OP_0D1_VALUE
													* @generated
													* @ordered
													*/
	OP_0D1(209, "OP_0D1", "Drum6B Effect Select"), /**
													* The '<em><b>OP 0D2</b></em>' literal object.
													* <!-- begin-user-doc -->
													* <!-- end-user-doc -->
													* @see #OP_0D2_VALUE
													* @generated
													* @ordered
													*/
	OP_0D2(210, "OP_0D2", "Drum6B Modulation Type"), /**
														* The '<em><b>OP 0D3</b></em>' literal object.
														* <!-- begin-user-doc -->
														* <!-- end-user-doc -->
														* @see #OP_0D3_VALUE
														* @generated
														* @ordered
														*/
	OP_0D3(211, "OP_0D3", "Drum6B Modulation Depth"), /**
														* The '<em><b>OP 0D4</b></em>' literal object.
														* <!-- begin-user-doc -->
														* <!-- end-user-doc -->
														* @see #OP_0D4_VALUE
														* @generated
														* @ordered
														*/
	OP_0D4(212, "OP_0D4", "Drum6B Modulation Speed"), /**
														* The '<em><b>OP 0D5</b></em>' literal object.
														* <!-- begin-user-doc -->
														* <!-- end-user-doc -->
														* @see #OP_0D5_VALUE
														* @generated
														* @ordered
														*/
	OP_0D5(213, "OP_0D5", "Drum6B Modulation Destination"), /**
															* The '<em><b>OP 0D6</b></em>' literal object.
															* <!-- begin-user-doc -->
															* <!-- end-user-doc -->
															* @see #OP_0D6_VALUE
															* @generated
															* @ordered
															*/
	OP_0D6(214, "OP_0D6", "Drum6B Modulation BPM Sync"), /**
															* The '<em><b>OP 0D7</b></em>' literal object.
															* <!-- begin-user-doc -->
															* <!-- end-user-doc -->
															* @see #OP_0D7_VALUE
															* @generated
															* @ordered
															*/
	OP_0D7(215, "OP_0D7", "Drum6B Motion Seq Type"), /**
														* The '<em><b>OP 0E4</b></em>' literal object.
														* <!-- begin-user-doc -->
														* <!-- end-user-doc -->
														* @see #OP_0E4_VALUE
														* @generated
														* @ordered
														*/
	OP_0E4(228, "OP_0E4", "Drum7A Pitch"), /**
											* The '<em><b>OP 0E5</b></em>' literal object.
											* <!-- begin-user-doc -->
											* <!-- end-user-doc -->
											* @see #OP_0E5_VALUE
											* @generated
											* @ordered
											*/
	OP_0E5(229, "OP_0E5", "Drum7A Filter Type"), /**
													* The '<em><b>OP 0E6</b></em>' literal object.
													* <!-- begin-user-doc -->
													* <!-- end-user-doc -->
													* @see #OP_0E6_VALUE
													* @generated
													* @ordered
													*/
	OP_0E6(230, "OP_0E6", "Drum7A Filter Cutoff"), /**
													* The '<em><b>OP 0E7</b></em>' literal object.
													* <!-- begin-user-doc -->
													* <!-- end-user-doc -->
													* @see #OP_0E7_VALUE
													* @generated
													* @ordered
													*/
	OP_0E7(231, "OP_0E7", "Drum7A Filter Resonance"), /**
														* The '<em><b>OP 0E8</b></em>' literal object.
														* <!-- begin-user-doc -->
														* <!-- end-user-doc -->
														* @see #OP_0E8_VALUE
														* @generated
														* @ordered
														*/
	OP_0E8(232, "OP_0E8", "Drum7A Filter EG Int"), /**
													* The '<em><b>OP 0E9</b></em>' literal object.
													* <!-- begin-user-doc -->
													* <!-- end-user-doc -->
													* @see #OP_0E9_VALUE
													* @generated
													* @ordered
													*/
	OP_0E9(233, "OP_0E9", "Drum7A Start Point"), /**
													* The '<em><b>OP 0EA</b></em>' literal object.
													* <!-- begin-user-doc -->
													* <!-- end-user-doc -->
													* @see #OP_0EA_VALUE
													* @generated
													* @ordered
													*/
	OP_0EA(234, "OP_0EA", "Drum7A Level"), /**
											* The '<em><b>OP 0EB</b></em>' literal object.
											* <!-- begin-user-doc -->
											* <!-- end-user-doc -->
											* @see #OP_0EB_VALUE
											* @generated
											* @ordered
											*/
	OP_0EB(235, "OP_0EB", "Drum7A Pan"), /**
											* The '<em><b>OP 0EC</b></em>' literal object.
											* <!-- begin-user-doc -->
											* <!-- end-user-doc -->
											* @see #OP_0EC_VALUE
											* @generated
											* @ordered
											*/
	OP_0EC(236, "OP_0EC", "Drum7A EG Time"), /**
												* The '<em><b>OP 0ED</b></em>' literal object.
												* <!-- begin-user-doc -->
												* <!-- end-user-doc -->
												* @see #OP_0ED_VALUE
												* @generated
												* @ordered
												*/
	OP_0ED(237, "OP_0ED", "Drum7A Amp EG"), /**
											* The '<em><b>OP 0EE</b></em>' literal object.
											* <!-- begin-user-doc -->
											* <!-- end-user-doc -->
											* @see #OP_0EE_VALUE
											* @generated
											* @ordered
											*/
	OP_0EE(238, "OP_0EE", "Drum7A Roll"), /**
											* The '<em><b>OP 0EF</b></em>' literal object.
											* <!-- begin-user-doc -->
											* <!-- end-user-doc -->
											* @see #OP_0EF_VALUE
											* @generated
											* @ordered
											*/
	OP_0EF(239, "OP_0EF", "Drum7A Reverse"), /**
												* The '<em><b>OP 0F0</b></em>' literal object.
												* <!-- begin-user-doc -->
												* <!-- end-user-doc -->
												* @see #OP_0F0_VALUE
												* @generated
												* @ordered
												*/
	OP_0F0(240, "OP_0F0", "Drum7A Effect Send"), /**
													* The '<em><b>OP 0F1</b></em>' literal object.
													* <!-- begin-user-doc -->
													* <!-- end-user-doc -->
													* @see #OP_0F1_VALUE
													* @generated
													* @ordered
													*/
	OP_0F1(241, "OP_0F1", "Drum7A Effect Select"), /**
													* The '<em><b>OP 0F2</b></em>' literal object.
													* <!-- begin-user-doc -->
													* <!-- end-user-doc -->
													* @see #OP_0F2_VALUE
													* @generated
													* @ordered
													*/
	OP_0F2(242, "OP_0F2", "Drum7A Modulation Type"), /**
														* The '<em><b>OP 0F3</b></em>' literal object.
														* <!-- begin-user-doc -->
														* <!-- end-user-doc -->
														* @see #OP_0F3_VALUE
														* @generated
														* @ordered
														*/
	OP_0F3(243, "OP_0F3", "Drum7A Modulation Depth"), /**
														* The '<em><b>OP 0F4</b></em>' literal object.
														* <!-- begin-user-doc -->
														* <!-- end-user-doc -->
														* @see #OP_0F4_VALUE
														* @generated
														* @ordered
														*/
	OP_0F4(244, "OP_0F4", "Drum7A Modulation Speed"), /**
														* The '<em><b>OP 0F5</b></em>' literal object.
														* <!-- begin-user-doc -->
														* <!-- end-user-doc -->
														* @see #OP_0F5_VALUE
														* @generated
														* @ordered
														*/
	OP_0F5(245, "OP_0F5", "Drum7A Modulation Destination"), /**
															* The '<em><b>OP 0F6</b></em>' literal object.
															* <!-- begin-user-doc -->
															* <!-- end-user-doc -->
															* @see #OP_0F6_VALUE
															* @generated
															* @ordered
															*/
	OP_0F6(246, "OP_0F6", "Drum7A Modulation BPM Sync"), /**
															* The '<em><b>OP 0F7</b></em>' literal object.
															* <!-- begin-user-doc -->
															* <!-- end-user-doc -->
															* @see #OP_0F7_VALUE
															* @generated
															* @ordered
															*/
	OP_0F7(247, "OP_0F7", "Drum7A Motion Seq Type"), /**
														* The '<em><b>OP 104</b></em>' literal object.
														* <!-- begin-user-doc -->
														* <!-- end-user-doc -->
														* @see #OP_104_VALUE
														* @generated
														* @ordered
														*/
	OP_104(260, "OP_104", "Drum7B Pitch"), /**
											* The '<em><b>OP 105</b></em>' literal object.
											* <!-- begin-user-doc -->
											* <!-- end-user-doc -->
											* @see #OP_105_VALUE
											* @generated
											* @ordered
											*/
	OP_105(261, "OP_105", "Drum7B Filter Type"), /**
													* The '<em><b>OP 106</b></em>' literal object.
													* <!-- begin-user-doc -->
													* <!-- end-user-doc -->
													* @see #OP_106_VALUE
													* @generated
													* @ordered
													*/
	OP_106(262, "OP_106", "Drum7B Filter Cutoff"), /**
													* The '<em><b>OP 107</b></em>' literal object.
													* <!-- begin-user-doc -->
													* <!-- end-user-doc -->
													* @see #OP_107_VALUE
													* @generated
													* @ordered
													*/
	OP_107(263, "OP_107", "Drum7B Filter Resonance"), /**
														* The '<em><b>OP 108</b></em>' literal object.
														* <!-- begin-user-doc -->
														* <!-- end-user-doc -->
														* @see #OP_108_VALUE
														* @generated
														* @ordered
														*/
	OP_108(264, "OP_108", "Drum7B Filter EG Int"), /**
													* The '<em><b>OP 109</b></em>' literal object.
													* <!-- begin-user-doc -->
													* <!-- end-user-doc -->
													* @see #OP_109_VALUE
													* @generated
													* @ordered
													*/
	OP_109(265, "OP_109", "Drum7B Start Point"), /**
													* The '<em><b>OP 10A</b></em>' literal object.
													* <!-- begin-user-doc -->
													* <!-- end-user-doc -->
													* @see #OP_10A_VALUE
													* @generated
													* @ordered
													*/
	OP_10A(266, "OP_10A", "Drum7B Level"), /**
											* The '<em><b>OP 10B</b></em>' literal object.
											* <!-- begin-user-doc -->
											* <!-- end-user-doc -->
											* @see #OP_10B_VALUE
											* @generated
											* @ordered
											*/
	OP_10B(267, "OP_10B", "Drum7B Pan"), /**
											* The '<em><b>OP 10C</b></em>' literal object.
											* <!-- begin-user-doc -->
											* <!-- end-user-doc -->
											* @see #OP_10C_VALUE
											* @generated
											* @ordered
											*/
	OP_10C(268, "OP_10C", "Drum7B EG Time"), /**
												* The '<em><b>OP 10D</b></em>' literal object.
												* <!-- begin-user-doc -->
												* <!-- end-user-doc -->
												* @see #OP_10D_VALUE
												* @generated
												* @ordered
												*/
	OP_10D(269, "OP_10D", "Drum7B Amp EG"), /**
											* The '<em><b>OP 10E</b></em>' literal object.
											* <!-- begin-user-doc -->
											* <!-- end-user-doc -->
											* @see #OP_10E_VALUE
											* @generated
											* @ordered
											*/
	OP_10E(270, "OP_10E", "Drum7B Roll"), /**
											* The '<em><b>OP 10F</b></em>' literal object.
											* <!-- begin-user-doc -->
											* <!-- end-user-doc -->
											* @see #OP_10F_VALUE
											* @generated
											* @ordered
											*/
	OP_10F(271, "OP_10F", "Drum7B Reverse"), /**
												* The '<em><b>OP 110</b></em>' literal object.
												* <!-- begin-user-doc -->
												* <!-- end-user-doc -->
												* @see #OP_110_VALUE
												* @generated
												* @ordered
												*/
	OP_110(272, "OP_110", "Drum7B Effect Send"), /**
													* The '<em><b>OP 111</b></em>' literal object.
													* <!-- begin-user-doc -->
													* <!-- end-user-doc -->
													* @see #OP_111_VALUE
													* @generated
													* @ordered
													*/
	OP_111(273, "OP_111", "Drum7B Effect Select"), /**
													* The '<em><b>OP 112</b></em>' literal object.
													* <!-- begin-user-doc -->
													* <!-- end-user-doc -->
													* @see #OP_112_VALUE
													* @generated
													* @ordered
													*/
	OP_112(274, "OP_112", "Drum7B Modulation Type"), /**
														* The '<em><b>OP 113</b></em>' literal object.
														* <!-- begin-user-doc -->
														* <!-- end-user-doc -->
														* @see #OP_113_VALUE
														* @generated
														* @ordered
														*/
	OP_113(275, "OP_113", "Drum7B Modulation Depth"), /**
														* The '<em><b>OP 114</b></em>' literal object.
														* <!-- begin-user-doc -->
														* <!-- end-user-doc -->
														* @see #OP_114_VALUE
														* @generated
														* @ordered
														*/
	OP_114(276, "OP_114", "Drum7B Modulation Speed"), /**
														* The '<em><b>OP 115</b></em>' literal object.
														* <!-- begin-user-doc -->
														* <!-- end-user-doc -->
														* @see #OP_115_VALUE
														* @generated
														* @ordered
														*/
	OP_115(277, "OP_115", "Drum7B Modulation Destination"), /**
															* The '<em><b>OP 116</b></em>' literal object.
															* <!-- begin-user-doc -->
															* <!-- end-user-doc -->
															* @see #OP_116_VALUE
															* @generated
															* @ordered
															*/
	OP_116(278, "OP_116", "Drum7B Modulation BPM Sync"), /**
															* The '<em><b>OP 117</b></em>' literal object.
															* <!-- begin-user-doc -->
															* <!-- end-user-doc -->
															* @see #OP_117_VALUE
															* @generated
															* @ordered
															*/
	OP_117(279, "OP_117", "Drum7B Motion Seq Type"), /**
														* The '<em><b>OP 123</b></em>' literal object.
														* <!-- begin-user-doc -->
														* <!-- end-user-doc -->
														* @see #OP_123_VALUE
														* @generated
														* @ordered
														*/
	OP_123(291, "OP_123", "Keyboard1 Glide"), /**
												* The '<em><b>OP 125</b></em>' literal object.
												* <!-- begin-user-doc -->
												* <!-- end-user-doc -->
												* @see #OP_125_VALUE
												* @generated
												* @ordered
												*/
	OP_125(293, "OP_125", "Keyboard1 Filter Type"), /**
													* The '<em><b>OP 126</b></em>' literal object.
													* <!-- begin-user-doc -->
													* <!-- end-user-doc -->
													* @see #OP_126_VALUE
													* @generated
													* @ordered
													*/
	OP_126(294, "OP_126", "Keyboard1 Filter Cutoff"), /**
														* The '<em><b>OP 127</b></em>' literal object.
														* <!-- begin-user-doc -->
														* <!-- end-user-doc -->
														* @see #OP_127_VALUE
														* @generated
														* @ordered
														*/
	OP_127(295, "OP_127", "Keyboard1 Filter Resonance"), /**
															* The '<em><b>OP 128</b></em>' literal object.
															* <!-- begin-user-doc -->
															* <!-- end-user-doc -->
															* @see #OP_128_VALUE
															* @generated
															* @ordered
															*/
	OP_128(296, "OP_128", "Keyboard1 Filter EG Int"), /**
														* The '<em><b>OP 129</b></em>' literal object.
														* <!-- begin-user-doc -->
														* <!-- end-user-doc -->
														* @see #OP_129_VALUE
														* @generated
														* @ordered
														*/
	OP_129(297, "OP_129", "Keyboard1 Start Point"), /**
													* The '<em><b>OP 12A</b></em>' literal object.
													* <!-- begin-user-doc -->
													* <!-- end-user-doc -->
													* @see #OP_12A_VALUE
													* @generated
													* @ordered
													*/
	OP_12A(298, "OP_12A", "Keyboard1 Level"), /**
												* The '<em><b>OP 12B</b></em>' literal object.
												* <!-- begin-user-doc -->
												* <!-- end-user-doc -->
												* @see #OP_12B_VALUE
												* @generated
												* @ordered
												*/
	OP_12B(299, "OP_12B", "Keyboard1 Pan"), /**
											* The '<em><b>OP 12C</b></em>' literal object.
											* <!-- begin-user-doc -->
											* <!-- end-user-doc -->
											* @see #OP_12C_VALUE
											* @generated
											* @ordered
											*/
	OP_12C(300, "OP_12C", "Keyboard1 EG Time"), /**
												* The '<em><b>OP 12D</b></em>' literal object.
												* <!-- begin-user-doc -->
												* <!-- end-user-doc -->
												* @see #OP_12D_VALUE
												* @generated
												* @ordered
												*/
	OP_12D(301, "OP_12D", "Keyboard1 Amp EG"), /**
												* The '<em><b>OP 12E</b></em>' literal object.
												* <!-- begin-user-doc -->
												* <!-- end-user-doc -->
												* @see #OP_12E_VALUE
												* @generated
												* @ordered
												*/
	OP_12E(302, "OP_12E", "Keyboard1 Roll"), /**
												* The '<em><b>OP 12F</b></em>' literal object.
												* <!-- begin-user-doc -->
												* <!-- end-user-doc -->
												* @see #OP_12F_VALUE
												* @generated
												* @ordered
												*/
	OP_12F(303, "OP_12F", "Keyboard1 Reverse"), /**
												* The '<em><b>OP 130</b></em>' literal object.
												* <!-- begin-user-doc -->
												* <!-- end-user-doc -->
												* @see #OP_130_VALUE
												* @generated
												* @ordered
												*/
	OP_130(304, "OP_130", "Keyboard1 Effect Send"), /**
													* The '<em><b>OP 131</b></em>' literal object.
													* <!-- begin-user-doc -->
													* <!-- end-user-doc -->
													* @see #OP_131_VALUE
													* @generated
													* @ordered
													*/
	OP_131(305, "OP_131", "Keyboard1 Effect Select"), /**
														* The '<em><b>OP 132</b></em>' literal object.
														* <!-- begin-user-doc -->
														* <!-- end-user-doc -->
														* @see #OP_132_VALUE
														* @generated
														* @ordered
														*/
	OP_132(306, "OP_132", "Keyboard1 Modulation Type"), /**
														* The '<em><b>OP 133</b></em>' literal object.
														* <!-- begin-user-doc -->
														* <!-- end-user-doc -->
														* @see #OP_133_VALUE
														* @generated
														* @ordered
														*/
	OP_133(307, "OP_133", "Keyboard1 Modulation Depth"), /**
															* The '<em><b>OP 134</b></em>' literal object.
															* <!-- begin-user-doc -->
															* <!-- end-user-doc -->
															* @see #OP_134_VALUE
															* @generated
															* @ordered
															*/
	OP_134(308, "OP_134", "Keyboard1 Modulation Speed"), /**
															* The '<em><b>OP 135</b></em>' literal object.
															* <!-- begin-user-doc -->
															* <!-- end-user-doc -->
															* @see #OP_135_VALUE
															* @generated
															* @ordered
															*/
	OP_135(309, "OP_135", "Keyboard1 Modulation Destination"), /**
																* The '<em><b>OP 136</b></em>' literal object.
																* <!-- begin-user-doc -->
																* <!-- end-user-doc -->
																* @see #OP_136_VALUE
																* @generated
																* @ordered
																*/
	OP_136(310, "OP_136", "Keyboard1 Modulation BPM Sync"), /**
															* The '<em><b>OP 137</b></em>' literal object.
															* <!-- begin-user-doc -->
															* <!-- end-user-doc -->
															* @see #OP_137_VALUE
															* @generated
															* @ordered
															*/
	OP_137(311, "OP_137", "Keyboard1 Motion Seq Type"), /**
														* The '<em><b>OP 143</b></em>' literal object.
														* <!-- begin-user-doc -->
														* <!-- end-user-doc -->
														* @see #OP_143_VALUE
														* @generated
														* @ordered
														*/
	OP_143(323, "OP_143", "Keyboard2 Glide"), /**
												* The '<em><b>OP 145</b></em>' literal object.
												* <!-- begin-user-doc -->
												* <!-- end-user-doc -->
												* @see #OP_145_VALUE
												* @generated
												* @ordered
												*/
	OP_145(325, "OP_145", "Keyboard2 Filter Type"), /**
													* The '<em><b>OP 146</b></em>' literal object.
													* <!-- begin-user-doc -->
													* <!-- end-user-doc -->
													* @see #OP_146_VALUE
													* @generated
													* @ordered
													*/
	OP_146(326, "OP_146", "Keyboard2 Filter Cutoff"), /**
														* The '<em><b>OP 147</b></em>' literal object.
														* <!-- begin-user-doc -->
														* <!-- end-user-doc -->
														* @see #OP_147_VALUE
														* @generated
														* @ordered
														*/
	OP_147(327, "OP_147", "Keyboard2 Filter Resonance"), /**
															* The '<em><b>OP 148</b></em>' literal object.
															* <!-- begin-user-doc -->
															* <!-- end-user-doc -->
															* @see #OP_148_VALUE
															* @generated
															* @ordered
															*/
	OP_148(328, "OP_148", "Keyboard2 Filter EG Int"), /**
														* The '<em><b>OP 149</b></em>' literal object.
														* <!-- begin-user-doc -->
														* <!-- end-user-doc -->
														* @see #OP_149_VALUE
														* @generated
														* @ordered
														*/
	OP_149(329, "OP_149", "Keyboard2 Start Point"), /**
													* The '<em><b>OP 14A</b></em>' literal object.
													* <!-- begin-user-doc -->
													* <!-- end-user-doc -->
													* @see #OP_14A_VALUE
													* @generated
													* @ordered
													*/
	OP_14A(330, "OP_14A", "Keyboard2 Level"), /**
												* The '<em><b>OP 14B</b></em>' literal object.
												* <!-- begin-user-doc -->
												* <!-- end-user-doc -->
												* @see #OP_14B_VALUE
												* @generated
												* @ordered
												*/
	OP_14B(331, "OP_14B", "Keyboard2 Pan"), /**
											* The '<em><b>OP 14C</b></em>' literal object.
											* <!-- begin-user-doc -->
											* <!-- end-user-doc -->
											* @see #OP_14C_VALUE
											* @generated
											* @ordered
											*/
	OP_14C(332, "OP_14C", "Keyboard2 EG Time"), /**
												* The '<em><b>OP 14D</b></em>' literal object.
												* <!-- begin-user-doc -->
												* <!-- end-user-doc -->
												* @see #OP_14D_VALUE
												* @generated
												* @ordered
												*/
	OP_14D(333, "OP_14D", "Keyboard2 Amp EG"), /**
												* The '<em><b>OP 14E</b></em>' literal object.
												* <!-- begin-user-doc -->
												* <!-- end-user-doc -->
												* @see #OP_14E_VALUE
												* @generated
												* @ordered
												*/
	OP_14E(334, "OP_14E", "Keyboard2 Roll"), /**
												* The '<em><b>OP 14F</b></em>' literal object.
												* <!-- begin-user-doc -->
												* <!-- end-user-doc -->
												* @see #OP_14F_VALUE
												* @generated
												* @ordered
												*/
	OP_14F(335, "OP_14F", "Keyboard2 Reverse"), /**
												* The '<em><b>OP 150</b></em>' literal object.
												* <!-- begin-user-doc -->
												* <!-- end-user-doc -->
												* @see #OP_150_VALUE
												* @generated
												* @ordered
												*/
	OP_150(336, "OP_150", "Keyboard2 Effect Send"), /**
													* The '<em><b>OP 151</b></em>' literal object.
													* <!-- begin-user-doc -->
													* <!-- end-user-doc -->
													* @see #OP_151_VALUE
													* @generated
													* @ordered
													*/
	OP_151(337, "OP_151", "Keyboard2 Effect Select"), /**
														* The '<em><b>OP 152</b></em>' literal object.
														* <!-- begin-user-doc -->
														* <!-- end-user-doc -->
														* @see #OP_152_VALUE
														* @generated
														* @ordered
														*/
	OP_152(338, "OP_152", "Keyboard2 Modulation Type"), /**
														* The '<em><b>OP 153</b></em>' literal object.
														* <!-- begin-user-doc -->
														* <!-- end-user-doc -->
														* @see #OP_153_VALUE
														* @generated
														* @ordered
														*/
	OP_153(339, "OP_153", "Keyboard2 Modulation Depth"), /**
															* The '<em><b>OP 154</b></em>' literal object.
															* <!-- begin-user-doc -->
															* <!-- end-user-doc -->
															* @see #OP_154_VALUE
															* @generated
															* @ordered
															*/
	OP_154(340, "OP_154", "Keyboard2 Modulation Speed"), /**
															* The '<em><b>OP 155</b></em>' literal object.
															* <!-- begin-user-doc -->
															* <!-- end-user-doc -->
															* @see #OP_155_VALUE
															* @generated
															* @ordered
															*/
	OP_155(341, "OP_155", "Keyboard2 Modulation Destination"), /**
																* The '<em><b>OP 156</b></em>' literal object.
																* <!-- begin-user-doc -->
																* <!-- end-user-doc -->
																* @see #OP_156_VALUE
																* @generated
																* @ordered
																*/
	OP_156(342, "OP_156", "Keyboard2 Modulation BPM Sync"), /**
															* The '<em><b>OP 157</b></em>' literal object.
															* <!-- begin-user-doc -->
															* <!-- end-user-doc -->
															* @see #OP_157_VALUE
															* @generated
															* @ordered
															*/
	OP_157(343, "OP_157", "Keyboard2 Motion Seq Type"), /**
														* The '<em><b>OP 164</b></em>' literal object.
														* <!-- begin-user-doc -->
														* <!-- end-user-doc -->
														* @see #OP_164_VALUE
														* @generated
														* @ordered
														*/
	OP_164(356, "OP_164", "Stretch1 Pitch"), /**
												* The '<em><b>OP 165</b></em>' literal object.
												* <!-- begin-user-doc -->
												* <!-- end-user-doc -->
												* @see #OP_165_VALUE
												* @generated
												* @ordered
												*/
	OP_165(357, "OP_165", "Stretch1 Filter Type"), /**
													* The '<em><b>OP 166</b></em>' literal object.
													* <!-- begin-user-doc -->
													* <!-- end-user-doc -->
													* @see #OP_166_VALUE
													* @generated
													* @ordered
													*/
	OP_166(358, "OP_166", "Stretch1 Filter Cutoff"), /**
														* The '<em><b>OP 167</b></em>' literal object.
														* <!-- begin-user-doc -->
														* <!-- end-user-doc -->
														* @see #OP_167_VALUE
														* @generated
														* @ordered
														*/
	OP_167(359, "OP_167", "Stretch1 Filter Resonance"), /**
														* The '<em><b>OP 168</b></em>' literal object.
														* <!-- begin-user-doc -->
														* <!-- end-user-doc -->
														* @see #OP_168_VALUE
														* @generated
														* @ordered
														*/
	OP_168(360, "OP_168", "Stretch1 Filter EG Int"), /**
														* The '<em><b>OP 169</b></em>' literal object.
														* <!-- begin-user-doc -->
														* <!-- end-user-doc -->
														* @see #OP_169_VALUE
														* @generated
														* @ordered
														*/
	OP_169(361, "OP_169", "Stretch1 Start Point"), /**
													* The '<em><b>OP 16A</b></em>' literal object.
													* <!-- begin-user-doc -->
													* <!-- end-user-doc -->
													* @see #OP_16A_VALUE
													* @generated
													* @ordered
													*/
	OP_16A(362, "OP_16A", "Stretch1 Level"), /**
												* The '<em><b>OP 16B</b></em>' literal object.
												* <!-- begin-user-doc -->
												* <!-- end-user-doc -->
												* @see #OP_16B_VALUE
												* @generated
												* @ordered
												*/
	OP_16B(363, "OP_16B", "Stretch1 Pan"), /**
											* The '<em><b>OP 16C</b></em>' literal object.
											* <!-- begin-user-doc -->
											* <!-- end-user-doc -->
											* @see #OP_16C_VALUE
											* @generated
											* @ordered
											*/
	OP_16C(364, "OP_16C", "Stretch1 EG Time"), /**
												* The '<em><b>OP 16D</b></em>' literal object.
												* <!-- begin-user-doc -->
												* <!-- end-user-doc -->
												* @see #OP_16D_VALUE
												* @generated
												* @ordered
												*/
	OP_16D(365, "OP_16D", "Stretch1 Amp EG"), /**
												* The '<em><b>OP 16E</b></em>' literal object.
												* <!-- begin-user-doc -->
												* <!-- end-user-doc -->
												* @see #OP_16E_VALUE
												* @generated
												* @ordered
												*/
	OP_16E(366, "OP_16E", "Stretch1 Roll"), /**
											* The '<em><b>OP 16F</b></em>' literal object.
											* <!-- begin-user-doc -->
											* <!-- end-user-doc -->
											* @see #OP_16F_VALUE
											* @generated
											* @ordered
											*/
	OP_16F(367, "OP_16F", "Stretch1 Reverse"), /**
												* The '<em><b>OP 170</b></em>' literal object.
												* <!-- begin-user-doc -->
												* <!-- end-user-doc -->
												* @see #OP_170_VALUE
												* @generated
												* @ordered
												*/
	OP_170(368, "OP_170", "Stretch1 Effect Send"), /**
													* The '<em><b>OP 171</b></em>' literal object.
													* <!-- begin-user-doc -->
													* <!-- end-user-doc -->
													* @see #OP_171_VALUE
													* @generated
													* @ordered
													*/
	OP_171(369, "OP_171", "Stretch1 Effect Select"), /**
														* The '<em><b>OP 172</b></em>' literal object.
														* <!-- begin-user-doc -->
														* <!-- end-user-doc -->
														* @see #OP_172_VALUE
														* @generated
														* @ordered
														*/
	OP_172(370, "OP_172", "Stretch1 Modulation Type"), /**
														* The '<em><b>OP 173</b></em>' literal object.
														* <!-- begin-user-doc -->
														* <!-- end-user-doc -->
														* @see #OP_173_VALUE
														* @generated
														* @ordered
														*/
	OP_173(371, "OP_173", "Stretch1 Modulation Depth"), /**
														* The '<em><b>OP 174</b></em>' literal object.
														* <!-- begin-user-doc -->
														* <!-- end-user-doc -->
														* @see #OP_174_VALUE
														* @generated
														* @ordered
														*/
	OP_174(372, "OP_174", "Stretch1 Modulation Speed"), /**
														* The '<em><b>OP 175</b></em>' literal object.
														* <!-- begin-user-doc -->
														* <!-- end-user-doc -->
														* @see #OP_175_VALUE
														* @generated
														* @ordered
														*/
	OP_175(373, "OP_175", "Stretch1 Modulation Destination"), /**
																* The '<em><b>OP 176</b></em>' literal object.
																* <!-- begin-user-doc -->
																* <!-- end-user-doc -->
																* @see #OP_176_VALUE
																* @generated
																* @ordered
																*/
	OP_176(374, "OP_176", "Stretch1 Modulation BPM Sync"), /**
															* The '<em><b>OP 177</b></em>' literal object.
															* <!-- begin-user-doc -->
															* <!-- end-user-doc -->
															* @see #OP_177_VALUE
															* @generated
															* @ordered
															*/
	OP_177(375, "OP_177", "Stretch1 Motion Seq Type"), /**
														* The '<em><b>OP 184</b></em>' literal object.
														* <!-- begin-user-doc -->
														* <!-- end-user-doc -->
														* @see #OP_184_VALUE
														* @generated
														* @ordered
														*/
	OP_184(388, "OP_184", "Stretch2 Pitch"), /**
												* The '<em><b>OP 185</b></em>' literal object.
												* <!-- begin-user-doc -->
												* <!-- end-user-doc -->
												* @see #OP_185_VALUE
												* @generated
												* @ordered
												*/
	OP_185(389, "OP_185", "Stretch2 Filter Type"), /**
													* The '<em><b>OP 186</b></em>' literal object.
													* <!-- begin-user-doc -->
													* <!-- end-user-doc -->
													* @see #OP_186_VALUE
													* @generated
													* @ordered
													*/
	OP_186(390, "OP_186", "Stretch2 Filter Cutoff"), /**
														* The '<em><b>OP 187</b></em>' literal object.
														* <!-- begin-user-doc -->
														* <!-- end-user-doc -->
														* @see #OP_187_VALUE
														* @generated
														* @ordered
														*/
	OP_187(391, "OP_187", "Stretch2 Filter Resonance"), /**
														* The '<em><b>OP 188</b></em>' literal object.
														* <!-- begin-user-doc -->
														* <!-- end-user-doc -->
														* @see #OP_188_VALUE
														* @generated
														* @ordered
														*/
	OP_188(392, "OP_188", "Stretch2 Filter EG Int"), /**
														* The '<em><b>OP 189</b></em>' literal object.
														* <!-- begin-user-doc -->
														* <!-- end-user-doc -->
														* @see #OP_189_VALUE
														* @generated
														* @ordered
														*/
	OP_189(393, "OP_189", "Stretch2 Start Point"), /**
													* The '<em><b>OP 18A</b></em>' literal object.
													* <!-- begin-user-doc -->
													* <!-- end-user-doc -->
													* @see #OP_18A_VALUE
													* @generated
													* @ordered
													*/
	OP_18A(394, "OP_18A", "Stretch2 Level"), /**
												* The '<em><b>OP 18B</b></em>' literal object.
												* <!-- begin-user-doc -->
												* <!-- end-user-doc -->
												* @see #OP_18B_VALUE
												* @generated
												* @ordered
												*/
	OP_18B(395, "OP_18B", "Stretch2 Pan"), /**
											* The '<em><b>OP 18C</b></em>' literal object.
											* <!-- begin-user-doc -->
											* <!-- end-user-doc -->
											* @see #OP_18C_VALUE
											* @generated
											* @ordered
											*/
	OP_18C(396, "OP_18C", "Stretch2 EG Time"), /**
												* The '<em><b>OP 18D</b></em>' literal object.
												* <!-- begin-user-doc -->
												* <!-- end-user-doc -->
												* @see #OP_18D_VALUE
												* @generated
												* @ordered
												*/
	OP_18D(397, "OP_18D", "Stretch2 Amp EG"), /**
												* The '<em><b>OP 18E</b></em>' literal object.
												* <!-- begin-user-doc -->
												* <!-- end-user-doc -->
												* @see #OP_18E_VALUE
												* @generated
												* @ordered
												*/
	OP_18E(398, "OP_18E", "Stretch2 Roll"), /**
											* The '<em><b>OP 18F</b></em>' literal object.
											* <!-- begin-user-doc -->
											* <!-- end-user-doc -->
											* @see #OP_18F_VALUE
											* @generated
											* @ordered
											*/
	OP_18F(399, "OP_18F", "Stretch2 Reverse"), /**
												* The '<em><b>OP 190</b></em>' literal object.
												* <!-- begin-user-doc -->
												* <!-- end-user-doc -->
												* @see #OP_190_VALUE
												* @generated
												* @ordered
												*/
	OP_190(400, "OP_190", "Stretch2 Effect Send"), /**
													* The '<em><b>OP 191</b></em>' literal object.
													* <!-- begin-user-doc -->
													* <!-- end-user-doc -->
													* @see #OP_191_VALUE
													* @generated
													* @ordered
													*/
	OP_191(401, "OP_191", "Stretch2 Effect Select"), /**
														* The '<em><b>OP 192</b></em>' literal object.
														* <!-- begin-user-doc -->
														* <!-- end-user-doc -->
														* @see #OP_192_VALUE
														* @generated
														* @ordered
														*/
	OP_192(402, "OP_192", "Stretch2 Modulation Type"), /**
														* The '<em><b>OP 193</b></em>' literal object.
														* <!-- begin-user-doc -->
														* <!-- end-user-doc -->
														* @see #OP_193_VALUE
														* @generated
														* @ordered
														*/
	OP_193(403, "OP_193", "Stretch2 Modulation Depth"), /**
														* The '<em><b>OP 194</b></em>' literal object.
														* <!-- begin-user-doc -->
														* <!-- end-user-doc -->
														* @see #OP_194_VALUE
														* @generated
														* @ordered
														*/
	OP_194(404, "OP_194", "Stretch2 Modulation Speed"), /**
														* The '<em><b>OP 195</b></em>' literal object.
														* <!-- begin-user-doc -->
														* <!-- end-user-doc -->
														* @see #OP_195_VALUE
														* @generated
														* @ordered
														*/
	OP_195(405, "OP_195", "Stretch2 Modulation Destination"), /**
																* The '<em><b>OP 196</b></em>' literal object.
																* <!-- begin-user-doc -->
																* <!-- end-user-doc -->
																* @see #OP_196_VALUE
																* @generated
																* @ordered
																*/
	OP_196(406, "OP_196", "Stretch2 Modulation BPM Sync"), /**
															* The '<em><b>OP 197</b></em>' literal object.
															* <!-- begin-user-doc -->
															* <!-- end-user-doc -->
															* @see #OP_197_VALUE
															* @generated
															* @ordered
															*/
	OP_197(407, "OP_197", "Stretch2 Motion Seq Type"), /**
														* The '<em><b>OP 1A4</b></em>' literal object.
														* <!-- begin-user-doc -->
														* <!-- end-user-doc -->
														* @see #OP_1A4_VALUE
														* @generated
														* @ordered
														*/
	OP_1A4(420, "OP_1A4", "Slice Pitch"), /**
											* The '<em><b>OP 1A5</b></em>' literal object.
											* <!-- begin-user-doc -->
											* <!-- end-user-doc -->
											* @see #OP_1A5_VALUE
											* @generated
											* @ordered
											*/
	OP_1A5(421, "OP_1A5", "Slice Filter Type"), /**
												* The '<em><b>OP 1A6</b></em>' literal object.
												* <!-- begin-user-doc -->
												* <!-- end-user-doc -->
												* @see #OP_1A6_VALUE
												* @generated
												* @ordered
												*/
	OP_1A6(422, "OP_1A6", "Slice Filter Cutoff"), /**
													* The '<em><b>OP 1A7</b></em>' literal object.
													* <!-- begin-user-doc -->
													* <!-- end-user-doc -->
													* @see #OP_1A7_VALUE
													* @generated
													* @ordered
													*/
	OP_1A7(423, "OP_1A7", "Slice Filter Resonance"), /**
														* The '<em><b>OP 1A8</b></em>' literal object.
														* <!-- begin-user-doc -->
														* <!-- end-user-doc -->
														* @see #OP_1A8_VALUE
														* @generated
														* @ordered
														*/
	OP_1A8(424, "OP_1A8", "Slice Filter EG Int"), /**
													* The '<em><b>OP 1A9</b></em>' literal object.
													* <!-- begin-user-doc -->
													* <!-- end-user-doc -->
													* @see #OP_1A9_VALUE
													* @generated
													* @ordered
													*/
	OP_1A9(425, "OP_1A9", "Slice Start Point"), /**
												* The '<em><b>OP 1AA</b></em>' literal object.
												* <!-- begin-user-doc -->
												* <!-- end-user-doc -->
												* @see #OP_1AA_VALUE
												* @generated
												* @ordered
												*/
	OP_1AA(426, "OP_1AA", "Slice Level"), /**
											* The '<em><b>OP 1AB</b></em>' literal object.
											* <!-- begin-user-doc -->
											* <!-- end-user-doc -->
											* @see #OP_1AB_VALUE
											* @generated
											* @ordered
											*/
	OP_1AB(427, "OP_1AB", "Slice Pan"), /**
										* The '<em><b>OP 1AC</b></em>' literal object.
										* <!-- begin-user-doc -->
										* <!-- end-user-doc -->
										* @see #OP_1AC_VALUE
										* @generated
										* @ordered
										*/
	OP_1AC(428, "OP_1AC", "Slice EG Time"), /**
											* The '<em><b>OP 1AD</b></em>' literal object.
											* <!-- begin-user-doc -->
											* <!-- end-user-doc -->
											* @see #OP_1AD_VALUE
											* @generated
											* @ordered
											*/
	OP_1AD(429, "OP_1AD", "Slice Amp EG"), /**
											* The '<em><b>OP 1AE</b></em>' literal object.
											* <!-- begin-user-doc -->
											* <!-- end-user-doc -->
											* @see #OP_1AE_VALUE
											* @generated
											* @ordered
											*/
	OP_1AE(430, "OP_1AE", "Slice Roll"), /**
											* The '<em><b>OP 1AF</b></em>' literal object.
											* <!-- begin-user-doc -->
											* <!-- end-user-doc -->
											* @see #OP_1AF_VALUE
											* @generated
											* @ordered
											*/
	OP_1AF(431, "OP_1AF", "Slice Reverse"), /**
											* The '<em><b>OP 1B0</b></em>' literal object.
											* <!-- begin-user-doc -->
											* <!-- end-user-doc -->
											* @see #OP_1B0_VALUE
											* @generated
											* @ordered
											*/
	OP_1B0(432, "OP_1B0", "Slice Effect Send"), /**
												* The '<em><b>OP 1B1</b></em>' literal object.
												* <!-- begin-user-doc -->
												* <!-- end-user-doc -->
												* @see #OP_1B1_VALUE
												* @generated
												* @ordered
												*/
	OP_1B1(433, "OP_1B1", "Slice Effect Select"), /**
													* The '<em><b>OP 1B2</b></em>' literal object.
													* <!-- begin-user-doc -->
													* <!-- end-user-doc -->
													* @see #OP_1B2_VALUE
													* @generated
													* @ordered
													*/
	OP_1B2(434, "OP_1B2", "Slice Modulation Type"), /**
													* The '<em><b>OP 1B3</b></em>' literal object.
													* <!-- begin-user-doc -->
													* <!-- end-user-doc -->
													* @see #OP_1B3_VALUE
													* @generated
													* @ordered
													*/
	OP_1B3(435, "OP_1B3", "Slice Modulation Depth"), /**
														* The '<em><b>OP 1B4</b></em>' literal object.
														* <!-- begin-user-doc -->
														* <!-- end-user-doc -->
														* @see #OP_1B4_VALUE
														* @generated
														* @ordered
														*/
	OP_1B4(436, "OP_1B4", "Slice Modulation Speed"), /**
														* The '<em><b>OP 1B5</b></em>' literal object.
														* <!-- begin-user-doc -->
														* <!-- end-user-doc -->
														* @see #OP_1B5_VALUE
														* @generated
														* @ordered
														*/
	OP_1B5(437, "OP_1B5", "Slice Modulation Destination"), /**
															* The '<em><b>OP 1B6</b></em>' literal object.
															* <!-- begin-user-doc -->
															* <!-- end-user-doc -->
															* @see #OP_1B6_VALUE
															* @generated
															* @ordered
															*/
	OP_1B6(438, "OP_1B6", "Slice Modulation BPM Sync"), /**
														* The '<em><b>OP 1B7</b></em>' literal object.
														* <!-- begin-user-doc -->
														* <!-- end-user-doc -->
														* @see #OP_1B7_VALUE
														* @generated
														* @ordered
														*/
	OP_1B7(439, "OP_1B7", "Slice Motion Seq Type"), /**
													* The '<em><b>OP 1C5</b></em>' literal object.
													* <!-- begin-user-doc -->
													* <!-- end-user-doc -->
													* @see #OP_1C5_VALUE
													* @generated
													* @ordered
													*/
	OP_1C5(453, "OP_1C5", "AudioIn Filter Type"), /**
													* The '<em><b>OP 1C6</b></em>' literal object.
													* <!-- begin-user-doc -->
													* <!-- end-user-doc -->
													* @see #OP_1C6_VALUE
													* @generated
													* @ordered
													*/
	OP_1C6(454, "OP_1C6", "AudioIn Filter Cutoff"), /**
													* The '<em><b>OP 1C7</b></em>' literal object.
													* <!-- begin-user-doc -->
													* <!-- end-user-doc -->
													* @see #OP_1C7_VALUE
													* @generated
													* @ordered
													*/
	OP_1C7(455, "OP_1C7", "AudioIn Filter Resonance"), /**
														* The '<em><b>OP 1C8</b></em>' literal object.
														* <!-- begin-user-doc -->
														* <!-- end-user-doc -->
														* @see #OP_1C8_VALUE
														* @generated
														* @ordered
														*/
	OP_1C8(456, "OP_1C8", "AudioIn Filter EG Int"), /**
													* The '<em><b>OP 1CA</b></em>' literal object.
													* <!-- begin-user-doc -->
													* <!-- end-user-doc -->
													* @see #OP_1CA_VALUE
													* @generated
													* @ordered
													*/
	OP_1CA(458, "OP_1CA", "AudioIn Level"), /**
											* The '<em><b>OP 1CB</b></em>' literal object.
											* <!-- begin-user-doc -->
											* <!-- end-user-doc -->
											* @see #OP_1CB_VALUE
											* @generated
											* @ordered
											*/
	OP_1CB(459, "OP_1CB", "AudioIn Pan"), /**
											* The '<em><b>OP 1CC</b></em>' literal object.
											* <!-- begin-user-doc -->
											* <!-- end-user-doc -->
											* @see #OP_1CC_VALUE
											* @generated
											* @ordered
											*/
	OP_1CC(460, "OP_1CC", "AudioIn EG Time"), /**
												* The '<em><b>OP 1CD</b></em>' literal object.
												* <!-- begin-user-doc -->
												* <!-- end-user-doc -->
												* @see #OP_1CD_VALUE
												* @generated
												* @ordered
												*/
	OP_1CD(461, "OP_1CD", "AudioIn Amp EG"), /**
												* The '<em><b>OP 1CE</b></em>' literal object.
												* <!-- begin-user-doc -->
												* <!-- end-user-doc -->
												* @see #OP_1CE_VALUE
												* @generated
												* @ordered
												*/
	OP_1CE(462, "OP_1CE", "AudioIn Roll"), /**
											* The '<em><b>OP 1D0</b></em>' literal object.
											* <!-- begin-user-doc -->
											* <!-- end-user-doc -->
											* @see #OP_1D0_VALUE
											* @generated
											* @ordered
											*/
	OP_1D0(464, "OP_1D0", "AudioIn Effect Send"), /**
													* The '<em><b>OP 1D1</b></em>' literal object.
													* <!-- begin-user-doc -->
													* <!-- end-user-doc -->
													* @see #OP_1D1_VALUE
													* @generated
													* @ordered
													*/
	OP_1D1(465, "OP_1D1", "AudioIn Effect Select"), /**
													* The '<em><b>OP 1D2</b></em>' literal object.
													* <!-- begin-user-doc -->
													* <!-- end-user-doc -->
													* @see #OP_1D2_VALUE
													* @generated
													* @ordered
													*/
	OP_1D2(466, "OP_1D2", "AudioIn Modulation Type"), /**
														* The '<em><b>OP 1D3</b></em>' literal object.
														* <!-- begin-user-doc -->
														* <!-- end-user-doc -->
														* @see #OP_1D3_VALUE
														* @generated
														* @ordered
														*/
	OP_1D3(467, "OP_1D3", "AudioIn Modulation Depth"), /**
														* The '<em><b>OP 1D4</b></em>' literal object.
														* <!-- begin-user-doc -->
														* <!-- end-user-doc -->
														* @see #OP_1D4_VALUE
														* @generated
														* @ordered
														*/
	OP_1D4(468, "OP_1D4", "AudioIn Modulation Speed"), /**
														* The '<em><b>OP 1D5</b></em>' literal object.
														* <!-- begin-user-doc -->
														* <!-- end-user-doc -->
														* @see #OP_1D5_VALUE
														* @generated
														* @ordered
														*/
	OP_1D5(469, "OP_1D5", "AudioIn Modulation Destination"), /**
																* The '<em><b>OP 1D6</b></em>' literal object.
																* <!-- begin-user-doc -->
																* <!-- end-user-doc -->
																* @see #OP_1D6_VALUE
																* @generated
																* @ordered
																*/
	OP_1D6(470, "OP_1D6", "AudioIn Modulation BPM Sync"), /**
															* The '<em><b>OP 1D7</b></em>' literal object.
															* <!-- begin-user-doc -->
															* <!-- end-user-doc -->
															* @see #OP_1D7_VALUE
															* @generated
															* @ordered
															*/
	OP_1D7(471, "OP_1D7", "AudioIn Motion Seq Type"), /**
														* The '<em><b>OP 1E0</b></em>' literal object.
														* <!-- begin-user-doc -->
														* <!-- end-user-doc -->
														* @see #OP_1E0_VALUE
														* @generated
														* @ordered
														*/
	OP_1E0(480, "OP_1E0", "Accent Level"), /**
											* The '<em><b>OP 1E1</b></em>' literal object.
											* <!-- begin-user-doc -->
											* <!-- end-user-doc -->
											* @see #OP_1E1_VALUE
											* @generated
											* @ordered
											*/
	OP_1E1(481, "OP_1E1", "Accent Motion Seq SW"), /**
													* The '<em><b>OP 1E4</b></em>' literal object.
													* <!-- begin-user-doc -->
													* <!-- end-user-doc -->
													* @see #OP_1E4_VALUE
													* @generated
													* @ordered
													*/
	OP_1E4(484, "OP_1E4", "FX1 Type"), /**
										* The '<em><b>OP 1E5</b></em>' literal object.
										* <!-- begin-user-doc -->
										* <!-- end-user-doc -->
										* @see #OP_1E5_VALUE
										* @generated
										* @ordered
										*/
	OP_1E5(485, "OP_1E5", "FX1 Edit1"), /**
										* The '<em><b>OP 1E6</b></em>' literal object.
										* <!-- begin-user-doc -->
										* <!-- end-user-doc -->
										* @see #OP_1E6_VALUE
										* @generated
										* @ordered
										*/
	OP_1E6(486, "OP_1E6", "FX1 Edit2"), /**
										* The '<em><b>OP 1E7</b></em>' literal object.
										* <!-- begin-user-doc -->
										* <!-- end-user-doc -->
										* @see #OP_1E7_VALUE
										* @generated
										* @ordered
										*/
	OP_1E7(487, "OP_1E7", "FX1 Motion Seq SW"), /**
												* The '<em><b>OP 1E8</b></em>' literal object.
												* <!-- begin-user-doc -->
												* <!-- end-user-doc -->
												* @see #OP_1E8_VALUE
												* @generated
												* @ordered
												*/
	OP_1E8(488, "OP_1E8", "FX2 Type"), /**
										* The '<em><b>OP 1E9</b></em>' literal object.
										* <!-- begin-user-doc -->
										* <!-- end-user-doc -->
										* @see #OP_1E9_VALUE
										* @generated
										* @ordered
										*/
	OP_1E9(489, "OP_1E9", "FX2 Edit1"), /**
										* The '<em><b>OP 1EA</b></em>' literal object.
										* <!-- begin-user-doc -->
										* <!-- end-user-doc -->
										* @see #OP_1EA_VALUE
										* @generated
										* @ordered
										*/
	OP_1EA(490, "OP_1EA", "FX2 Edit2"), /**
										* The '<em><b>OP 1EB</b></em>' literal object.
										* <!-- begin-user-doc -->
										* <!-- end-user-doc -->
										* @see #OP_1EB_VALUE
										* @generated
										* @ordered
										*/
	OP_1EB(491, "OP_1EB", "FX2 Motion Seq SW"), /**
												* The '<em><b>OP 1EC</b></em>' literal object.
												* <!-- begin-user-doc -->
												* <!-- end-user-doc -->
												* @see #OP_1EC_VALUE
												* @generated
												* @ordered
												*/
	OP_1EC(492, "OP_1EC", "FX3 Type"), /**
										* The '<em><b>OP 1ED</b></em>' literal object.
										* <!-- begin-user-doc -->
										* <!-- end-user-doc -->
										* @see #OP_1ED_VALUE
										* @generated
										* @ordered
										*/
	OP_1ED(493, "OP_1ED", "FX3 Edit1"), /**
										* The '<em><b>OP 1EE</b></em>' literal object.
										* <!-- begin-user-doc -->
										* <!-- end-user-doc -->
										* @see #OP_1EE_VALUE
										* @generated
										* @ordered
										*/
	OP_1EE(494, "OP_1EE", "FX3 Edit2"), /**
										* The '<em><b>OP 1EF</b></em>' literal object.
										* <!-- begin-user-doc -->
										* <!-- end-user-doc -->
										* @see #OP_1EF_VALUE
										* @generated
										* @ordered
										*/
	OP_1EF(495, "OP_1EF", "FX3 Motion Seq SW"), /**
												* The '<em><b>OP 1F5</b></em>' literal object.
												* <!-- begin-user-doc -->
												* <!-- end-user-doc -->
												* @see #OP_1F5_VALUE
												* @generated
												* @ordered
												*/
	OP_1F5(501, "OP_1F5", "FX Chain");

	/**
	 * The '<em><b>OP UNKNOWN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP UNKNOWN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_UNKNOWN
	 * @model literal="Unknown"
	 * @generated
	 * @ordered
	 */
	public static final int OP_UNKNOWN_VALUE = 0;

	/**
	 * The '<em><b>OP 004</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 004</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_004
	 * @model literal="Drum1 Pitch"
	 * @generated
	 * @ordered
	 */
	public static final int OP_004_VALUE = 4;

	/**
	 * The '<em><b>OP 005</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 005</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_005
	 * @model literal="Drum1 Filter Type"
	 * @generated
	 * @ordered
	 */
	public static final int OP_005_VALUE = 5;

	/**
	 * The '<em><b>OP 006</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 006</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_006
	 * @model literal="Drum1 Filter Cutoff"
	 * @generated
	 * @ordered
	 */
	public static final int OP_006_VALUE = 6;

	/**
	 * The '<em><b>OP 007</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 007</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_007
	 * @model literal="Drum1 Filter Resonance"
	 * @generated
	 * @ordered
	 */
	public static final int OP_007_VALUE = 7;

	/**
	 * The '<em><b>OP 008</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 008</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_008
	 * @model literal="Drum1 Filter EG Int"
	 * @generated
	 * @ordered
	 */
	public static final int OP_008_VALUE = 8;

	/**
	 * The '<em><b>OP 009</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 009</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_009
	 * @model literal="Drum1 Start Point"
	 * @generated
	 * @ordered
	 */
	public static final int OP_009_VALUE = 9;

	/**
	 * The '<em><b>OP 00A</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 00A</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_00A
	 * @model literal="Drum1 Level"
	 * @generated
	 * @ordered
	 */
	public static final int OP_00A_VALUE = 10;

	/**
	 * The '<em><b>OP 00B</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 00B</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_00B
	 * @model literal="Drum1 Pan"
	 * @generated
	 * @ordered
	 */
	public static final int OP_00B_VALUE = 11;

	/**
	 * The '<em><b>OP 00C</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 00C</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_00C
	 * @model literal="Drum1 EG Time"
	 * @generated
	 * @ordered
	 */
	public static final int OP_00C_VALUE = 12;

	/**
	 * The '<em><b>OP 00D</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 00D</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_00D
	 * @model literal="Drum1 Amp EG"
	 * @generated
	 * @ordered
	 */
	public static final int OP_00D_VALUE = 13;

	/**
	 * The '<em><b>OP 00E</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 00E</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_00E
	 * @model literal="Drum1 Roll"
	 * @generated
	 * @ordered
	 */
	public static final int OP_00E_VALUE = 14;

	/**
	 * The '<em><b>OP 00F</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 00F</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_00F
	 * @model literal="Drum1 Reverse"
	 * @generated
	 * @ordered
	 */
	public static final int OP_00F_VALUE = 15;

	/**
	 * The '<em><b>OP 010</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 010</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_010
	 * @model literal="Drum1 Effect Send"
	 * @generated
	 * @ordered
	 */
	public static final int OP_010_VALUE = 16;

	/**
	 * The '<em><b>OP 011</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 011</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_011
	 * @model literal="Drum1 Effect Select"
	 * @generated
	 * @ordered
	 */
	public static final int OP_011_VALUE = 17;

	/**
	 * The '<em><b>OP 012</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 012</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_012
	 * @model literal="Drum1 Modulation Type"
	 * @generated
	 * @ordered
	 */
	public static final int OP_012_VALUE = 18;

	/**
	 * The '<em><b>OP 013</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 013</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_013
	 * @model literal="Drum1 Modulation Depth"
	 * @generated
	 * @ordered
	 */
	public static final int OP_013_VALUE = 19;

	/**
	 * The '<em><b>OP 014</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 014</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_014
	 * @model literal="Drum1 Modulation Speed"
	 * @generated
	 * @ordered
	 */
	public static final int OP_014_VALUE = 20;

	/**
	 * The '<em><b>OP 015</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 015</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_015
	 * @model literal="Drum1 Modulation Destination"
	 * @generated
	 * @ordered
	 */
	public static final int OP_015_VALUE = 21;

	/**
	 * The '<em><b>OP 016</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 016</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_016
	 * @model literal="Drum1 Modulation BPM Sync"
	 * @generated
	 * @ordered
	 */
	public static final int OP_016_VALUE = 22;

	/**
	 * The '<em><b>OP 017</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 017</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_017
	 * @model literal="Drum1 Motion Seq Type"
	 * @generated
	 * @ordered
	 */
	public static final int OP_017_VALUE = 23;

	/**
	 * The '<em><b>OP 024</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 024</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_024
	 * @model literal="Drum2 Pitch"
	 * @generated
	 * @ordered
	 */
	public static final int OP_024_VALUE = 36;

	/**
	 * The '<em><b>OP 025</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 025</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_025
	 * @model literal="Drum2 Filter Type"
	 * @generated
	 * @ordered
	 */
	public static final int OP_025_VALUE = 37;

	/**
	 * The '<em><b>OP 026</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 026</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_026
	 * @model literal="Drum2 Filter Cutoff"
	 * @generated
	 * @ordered
	 */
	public static final int OP_026_VALUE = 38;

	/**
	 * The '<em><b>OP 027</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 027</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_027
	 * @model literal="Drum2 Filter Resonance"
	 * @generated
	 * @ordered
	 */
	public static final int OP_027_VALUE = 39;

	/**
	 * The '<em><b>OP 028</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 028</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_028
	 * @model literal="Drum2 Filter EG Int"
	 * @generated
	 * @ordered
	 */
	public static final int OP_028_VALUE = 40;

	/**
	 * The '<em><b>OP 029</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 029</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_029
	 * @model literal="Drum2 Start Point"
	 * @generated
	 * @ordered
	 */
	public static final int OP_029_VALUE = 41;

	/**
	 * The '<em><b>OP 02A</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 02A</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_02A
	 * @model literal="Drum2 Level"
	 * @generated
	 * @ordered
	 */
	public static final int OP_02A_VALUE = 42;

	/**
	 * The '<em><b>OP 02B</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 02B</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_02B
	 * @model literal="Drum2 Pan"
	 * @generated
	 * @ordered
	 */
	public static final int OP_02B_VALUE = 43;

	/**
	 * The '<em><b>OP 02C</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 02C</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_02C
	 * @model literal="Drum2 EG Time"
	 * @generated
	 * @ordered
	 */
	public static final int OP_02C_VALUE = 44;

	/**
	 * The '<em><b>OP 02D</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 02D</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_02D
	 * @model literal="Drum2 Amp EG"
	 * @generated
	 * @ordered
	 */
	public static final int OP_02D_VALUE = 45;

	/**
	 * The '<em><b>OP 02E</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 02E</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_02E
	 * @model literal="Drum2 Roll"
	 * @generated
	 * @ordered
	 */
	public static final int OP_02E_VALUE = 46;

	/**
	 * The '<em><b>OP 02F</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 02F</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_02F
	 * @model literal="Drum2 Reverse"
	 * @generated
	 * @ordered
	 */
	public static final int OP_02F_VALUE = 47;

	/**
	 * The '<em><b>OP 030</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 030</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_030
	 * @model literal="Drum2 Effect Send"
	 * @generated
	 * @ordered
	 */
	public static final int OP_030_VALUE = 48;

	/**
	 * The '<em><b>OP 031</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 031</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_031
	 * @model literal="Drum2 Effect Select"
	 * @generated
	 * @ordered
	 */
	public static final int OP_031_VALUE = 49;

	/**
	 * The '<em><b>OP 032</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 032</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_032
	 * @model literal="Drum2 Modulation Type"
	 * @generated
	 * @ordered
	 */
	public static final int OP_032_VALUE = 50;

	/**
	 * The '<em><b>OP 033</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 033</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_033
	 * @model literal="Drum2 Modulation Depth"
	 * @generated
	 * @ordered
	 */
	public static final int OP_033_VALUE = 51;

	/**
	 * The '<em><b>OP 034</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 034</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_034
	 * @model literal="Drum2 Modulation Speed"
	 * @generated
	 * @ordered
	 */
	public static final int OP_034_VALUE = 52;

	/**
	 * The '<em><b>OP 035</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 035</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_035
	 * @model literal="Drum2 Modulation Destination"
	 * @generated
	 * @ordered
	 */
	public static final int OP_035_VALUE = 53;

	/**
	 * The '<em><b>OP 036</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 036</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_036
	 * @model literal="Drum2 Modulation BPM Sync"
	 * @generated
	 * @ordered
	 */
	public static final int OP_036_VALUE = 54;

	/**
	 * The '<em><b>OP 037</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 037</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_037
	 * @model literal="Drum2 Motion Seq Type"
	 * @generated
	 * @ordered
	 */
	public static final int OP_037_VALUE = 55;

	/**
	 * The '<em><b>OP 044</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 044</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_044
	 * @model literal="Drum3 Pitch"
	 * @generated
	 * @ordered
	 */
	public static final int OP_044_VALUE = 68;

	/**
	 * The '<em><b>OP 045</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 045</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_045
	 * @model literal="Drum3 Filter Type"
	 * @generated
	 * @ordered
	 */
	public static final int OP_045_VALUE = 69;

	/**
	 * The '<em><b>OP 046</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 046</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_046
	 * @model literal="Drum3 Filter Cutoff"
	 * @generated
	 * @ordered
	 */
	public static final int OP_046_VALUE = 70;

	/**
	 * The '<em><b>OP 047</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 047</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_047
	 * @model literal="Drum3 Filter Resonance"
	 * @generated
	 * @ordered
	 */
	public static final int OP_047_VALUE = 71;

	/**
	 * The '<em><b>OP 048</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 048</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_048
	 * @model literal="Drum3 Filter EG Int"
	 * @generated
	 * @ordered
	 */
	public static final int OP_048_VALUE = 72;

	/**
	 * The '<em><b>OP 049</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 049</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_049
	 * @model literal="Drum3 Start Point"
	 * @generated
	 * @ordered
	 */
	public static final int OP_049_VALUE = 73;

	/**
	 * The '<em><b>OP 04A</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 04A</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_04A
	 * @model literal="Drum3 Level"
	 * @generated
	 * @ordered
	 */
	public static final int OP_04A_VALUE = 74;

	/**
	 * The '<em><b>OP 04B</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 04B</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_04B
	 * @model literal="Drum3 Pan"
	 * @generated
	 * @ordered
	 */
	public static final int OP_04B_VALUE = 75;

	/**
	 * The '<em><b>OP 04C</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 04C</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_04C
	 * @model literal="Drum3 EG Time"
	 * @generated
	 * @ordered
	 */
	public static final int OP_04C_VALUE = 76;

	/**
	 * The '<em><b>OP 04D</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 04D</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_04D
	 * @model literal="Drum3 Amp EG"
	 * @generated
	 * @ordered
	 */
	public static final int OP_04D_VALUE = 77;

	/**
	 * The '<em><b>OP 04E</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 04E</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_04E
	 * @model literal="Drum3 Roll"
	 * @generated
	 * @ordered
	 */
	public static final int OP_04E_VALUE = 78;

	/**
	 * The '<em><b>OP 04F</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 04F</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_04F
	 * @model literal="Drum3 Reverse"
	 * @generated
	 * @ordered
	 */
	public static final int OP_04F_VALUE = 79;

	/**
	 * The '<em><b>OP 050</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 050</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_050
	 * @model literal="Drum3 Effect Send"
	 * @generated
	 * @ordered
	 */
	public static final int OP_050_VALUE = 80;

	/**
	 * The '<em><b>OP 051</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 051</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_051
	 * @model literal="Drum3 Effect Select"
	 * @generated
	 * @ordered
	 */
	public static final int OP_051_VALUE = 81;

	/**
	 * The '<em><b>OP 052</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 052</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_052
	 * @model literal="Drum3 Modulation Type"
	 * @generated
	 * @ordered
	 */
	public static final int OP_052_VALUE = 82;

	/**
	 * The '<em><b>OP 053</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 053</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_053
	 * @model literal="Drum3 Modulation Depth"
	 * @generated
	 * @ordered
	 */
	public static final int OP_053_VALUE = 83;

	/**
	 * The '<em><b>OP 054</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 054</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_054
	 * @model literal="Drum3 Modulation Speed"
	 * @generated
	 * @ordered
	 */
	public static final int OP_054_VALUE = 84;

	/**
	 * The '<em><b>OP 055</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 055</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_055
	 * @model literal="Drum3 Modulation Destination"
	 * @generated
	 * @ordered
	 */
	public static final int OP_055_VALUE = 85;

	/**
	 * The '<em><b>OP 056</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 056</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_056
	 * @model literal="Drum3 Modulation BPM Sync"
	 * @generated
	 * @ordered
	 */
	public static final int OP_056_VALUE = 86;

	/**
	 * The '<em><b>OP 057</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 057</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_057
	 * @model literal="Drum3 Motion Seq Type"
	 * @generated
	 * @ordered
	 */
	public static final int OP_057_VALUE = 87;

	/**
	 * The '<em><b>OP 064</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 064</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_064
	 * @model literal="Drum4 Pitch"
	 * @generated
	 * @ordered
	 */
	public static final int OP_064_VALUE = 100;

	/**
	 * The '<em><b>OP 065</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 065</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_065
	 * @model literal="Drum4 Filter Type"
	 * @generated
	 * @ordered
	 */
	public static final int OP_065_VALUE = 101;

	/**
	 * The '<em><b>OP 066</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 066</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_066
	 * @model literal="Drum4 Filter Cutoff"
	 * @generated
	 * @ordered
	 */
	public static final int OP_066_VALUE = 102;

	/**
	 * The '<em><b>OP 067</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 067</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_067
	 * @model literal="Drum4 Filter Resonance"
	 * @generated
	 * @ordered
	 */
	public static final int OP_067_VALUE = 103;

	/**
	 * The '<em><b>OP 068</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 068</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_068
	 * @model literal="Drum4 Filter EG Int"
	 * @generated
	 * @ordered
	 */
	public static final int OP_068_VALUE = 104;

	/**
	 * The '<em><b>OP 069</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 069</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_069
	 * @model literal="Drum4 Start Point"
	 * @generated
	 * @ordered
	 */
	public static final int OP_069_VALUE = 105;

	/**
	 * The '<em><b>OP 06A</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 06A</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_06A
	 * @model literal="Drum4 Level"
	 * @generated
	 * @ordered
	 */
	public static final int OP_06A_VALUE = 106;

	/**
	 * The '<em><b>OP 06B</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 06B</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_06B
	 * @model literal="Drum4 Pan"
	 * @generated
	 * @ordered
	 */
	public static final int OP_06B_VALUE = 107;

	/**
	 * The '<em><b>OP 06C</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 06C</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_06C
	 * @model literal="Drum4 EG Time"
	 * @generated
	 * @ordered
	 */
	public static final int OP_06C_VALUE = 108;

	/**
	 * The '<em><b>OP 06D</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 06D</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_06D
	 * @model literal="Drum4 Amp EG"
	 * @generated
	 * @ordered
	 */
	public static final int OP_06D_VALUE = 109;

	/**
	 * The '<em><b>OP 06E</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 06E</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_06E
	 * @model literal="Drum4 Roll"
	 * @generated
	 * @ordered
	 */
	public static final int OP_06E_VALUE = 110;

	/**
	 * The '<em><b>OP 06F</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 06F</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_06F
	 * @model literal="Drum4 Reverse"
	 * @generated
	 * @ordered
	 */
	public static final int OP_06F_VALUE = 111;

	/**
	 * The '<em><b>OP 070</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 070</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_070
	 * @model literal="Drum4 Effect Send"
	 * @generated
	 * @ordered
	 */
	public static final int OP_070_VALUE = 112;

	/**
	 * The '<em><b>OP 071</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 071</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_071
	 * @model literal="Drum4 Effect Select"
	 * @generated
	 * @ordered
	 */
	public static final int OP_071_VALUE = 113;

	/**
	 * The '<em><b>OP 072</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 072</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_072
	 * @model literal="Drum4 Modulation Type"
	 * @generated
	 * @ordered
	 */
	public static final int OP_072_VALUE = 114;

	/**
	 * The '<em><b>OP 073</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 073</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_073
	 * @model literal="Drum4 Modulation Depth"
	 * @generated
	 * @ordered
	 */
	public static final int OP_073_VALUE = 115;

	/**
	 * The '<em><b>OP 074</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 074</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_074
	 * @model literal="Drum4 Modulation Speed"
	 * @generated
	 * @ordered
	 */
	public static final int OP_074_VALUE = 116;

	/**
	 * The '<em><b>OP 075</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 075</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_075
	 * @model literal="Drum4 Modulation Destination"
	 * @generated
	 * @ordered
	 */
	public static final int OP_075_VALUE = 117;

	/**
	 * The '<em><b>OP 076</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 076</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_076
	 * @model literal="Drum4 Modulation BPM Sync"
	 * @generated
	 * @ordered
	 */
	public static final int OP_076_VALUE = 118;

	/**
	 * The '<em><b>OP 077</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 077</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_077
	 * @model literal="Drum4 Motion Seq Type"
	 * @generated
	 * @ordered
	 */
	public static final int OP_077_VALUE = 119;

	/**
	 * The '<em><b>OP 084</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 084</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_084
	 * @model literal="Drum5 Pitch"
	 * @generated
	 * @ordered
	 */
	public static final int OP_084_VALUE = 132;

	/**
	 * The '<em><b>OP 085</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 085</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_085
	 * @model literal="Drum5 Filter Type"
	 * @generated
	 * @ordered
	 */
	public static final int OP_085_VALUE = 133;

	/**
	 * The '<em><b>OP 086</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 086</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_086
	 * @model literal="Drum5 Filter Cutoff"
	 * @generated
	 * @ordered
	 */
	public static final int OP_086_VALUE = 134;

	/**
	 * The '<em><b>OP 087</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 087</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_087
	 * @model literal="Drum5 Filter Resonance"
	 * @generated
	 * @ordered
	 */
	public static final int OP_087_VALUE = 135;

	/**
	 * The '<em><b>OP 088</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 088</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_088
	 * @model literal="Drum5 Filter EG Int"
	 * @generated
	 * @ordered
	 */
	public static final int OP_088_VALUE = 136;

	/**
	 * The '<em><b>OP 089</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 089</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_089
	 * @model literal="Drum5 Start Point"
	 * @generated
	 * @ordered
	 */
	public static final int OP_089_VALUE = 137;

	/**
	 * The '<em><b>OP 08A</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 08A</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_08A
	 * @model literal="Drum5 Level"
	 * @generated
	 * @ordered
	 */
	public static final int OP_08A_VALUE = 138;

	/**
	 * The '<em><b>OP 08B</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 08B</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_08B
	 * @model literal="Drum5 Pan"
	 * @generated
	 * @ordered
	 */
	public static final int OP_08B_VALUE = 139;

	/**
	 * The '<em><b>OP 08C</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 08C</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_08C
	 * @model literal="Drum5 EG Time"
	 * @generated
	 * @ordered
	 */
	public static final int OP_08C_VALUE = 140;

	/**
	 * The '<em><b>OP 08D</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 08D</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_08D
	 * @model literal="Drum5 Amp EG"
	 * @generated
	 * @ordered
	 */
	public static final int OP_08D_VALUE = 141;

	/**
	 * The '<em><b>OP 08E</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 08E</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_08E
	 * @model literal="Drum5 Roll"
	 * @generated
	 * @ordered
	 */
	public static final int OP_08E_VALUE = 142;

	/**
	 * The '<em><b>OP 08F</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 08F</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_08F
	 * @model literal="Drum5 Reverse"
	 * @generated
	 * @ordered
	 */
	public static final int OP_08F_VALUE = 143;

	/**
	 * The '<em><b>OP 090</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 090</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_090
	 * @model literal="Drum5 Effect Send"
	 * @generated
	 * @ordered
	 */
	public static final int OP_090_VALUE = 144;

	/**
	 * The '<em><b>OP 091</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 091</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_091
	 * @model literal="Drum5 Effect Select"
	 * @generated
	 * @ordered
	 */
	public static final int OP_091_VALUE = 145;

	/**
	 * The '<em><b>OP 092</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 092</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_092
	 * @model literal="Drum5 Modulation Type"
	 * @generated
	 * @ordered
	 */
	public static final int OP_092_VALUE = 146;

	/**
	 * The '<em><b>OP 093</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 093</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_093
	 * @model literal="Drum5 Modulation Depth"
	 * @generated
	 * @ordered
	 */
	public static final int OP_093_VALUE = 147;

	/**
	 * The '<em><b>OP 094</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 094</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_094
	 * @model literal="Drum5 Modulation Speed"
	 * @generated
	 * @ordered
	 */
	public static final int OP_094_VALUE = 148;

	/**
	 * The '<em><b>OP 095</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 095</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_095
	 * @model literal="Drum5 Modulation Destination"
	 * @generated
	 * @ordered
	 */
	public static final int OP_095_VALUE = 149;

	/**
	 * The '<em><b>OP 096</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 096</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_096
	 * @model literal="Drum5 Modulation BPM Sync"
	 * @generated
	 * @ordered
	 */
	public static final int OP_096_VALUE = 150;

	/**
	 * The '<em><b>OP 097</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 097</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_097
	 * @model literal="Drum5 Motion Seq Type"
	 * @generated
	 * @ordered
	 */
	public static final int OP_097_VALUE = 151;

	/**
	 * The '<em><b>OP 0A4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 0A4</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_0A4
	 * @model literal="Drum6A Pitch"
	 * @generated
	 * @ordered
	 */
	public static final int OP_0A4_VALUE = 164;

	/**
	 * The '<em><b>OP 0A5</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 0A5</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_0A5
	 * @model literal="Drum6A Filter Type"
	 * @generated
	 * @ordered
	 */
	public static final int OP_0A5_VALUE = 165;

	/**
	 * The '<em><b>OP 0A6</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 0A6</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_0A6
	 * @model literal="Drum6A Filter Cutoff"
	 * @generated
	 * @ordered
	 */
	public static final int OP_0A6_VALUE = 166;

	/**
	 * The '<em><b>OP 0A7</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 0A7</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_0A7
	 * @model literal="Drum6A Filter Resonance"
	 * @generated
	 * @ordered
	 */
	public static final int OP_0A7_VALUE = 167;

	/**
	 * The '<em><b>OP 0A8</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 0A8</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_0A8
	 * @model literal="Drum6A Filter EG Int"
	 * @generated
	 * @ordered
	 */
	public static final int OP_0A8_VALUE = 168;

	/**
	 * The '<em><b>OP 0A9</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 0A9</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_0A9
	 * @model literal="Drum6A Start Point"
	 * @generated
	 * @ordered
	 */
	public static final int OP_0A9_VALUE = 169;

	/**
	 * The '<em><b>OP 0AA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 0AA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_0AA
	 * @model literal="Drum6A Level"
	 * @generated
	 * @ordered
	 */
	public static final int OP_0AA_VALUE = 170;

	/**
	 * The '<em><b>OP 0AB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 0AB</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_0AB
	 * @model literal="Drum6A Pan"
	 * @generated
	 * @ordered
	 */
	public static final int OP_0AB_VALUE = 171;

	/**
	 * The '<em><b>OP 0AC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 0AC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_0AC
	 * @model literal="Drum6A EG Time"
	 * @generated
	 * @ordered
	 */
	public static final int OP_0AC_VALUE = 172;

	/**
	 * The '<em><b>OP 0AD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 0AD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_0AD
	 * @model literal="Drum6A Amp EG"
	 * @generated
	 * @ordered
	 */
	public static final int OP_0AD_VALUE = 173;

	/**
	 * The '<em><b>OP 0AE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 0AE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_0AE
	 * @model literal="Drum6A Roll"
	 * @generated
	 * @ordered
	 */
	public static final int OP_0AE_VALUE = 174;

	/**
	 * The '<em><b>OP 0AF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 0AF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_0AF
	 * @model literal="Drum6A Reverse"
	 * @generated
	 * @ordered
	 */
	public static final int OP_0AF_VALUE = 175;

	/**
	 * The '<em><b>OP 0B0</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 0B0</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_0B0
	 * @model literal="Drum6A Effect Send"
	 * @generated
	 * @ordered
	 */
	public static final int OP_0B0_VALUE = 176;

	/**
	 * The '<em><b>OP 0B1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 0B1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_0B1
	 * @model literal="Drum6A Effect Select"
	 * @generated
	 * @ordered
	 */
	public static final int OP_0B1_VALUE = 177;

	/**
	 * The '<em><b>OP 0B2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 0B2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_0B2
	 * @model literal="Drum6A Modulation Type"
	 * @generated
	 * @ordered
	 */
	public static final int OP_0B2_VALUE = 178;

	/**
	 * The '<em><b>OP 0B3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 0B3</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_0B3
	 * @model literal="Drum6A Modulation Depth"
	 * @generated
	 * @ordered
	 */
	public static final int OP_0B3_VALUE = 179;

	/**
	 * The '<em><b>OP 0B4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 0B4</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_0B4
	 * @model literal="Drum6A Modulation Speed"
	 * @generated
	 * @ordered
	 */
	public static final int OP_0B4_VALUE = 180;

	/**
	 * The '<em><b>OP 0B5</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 0B5</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_0B5
	 * @model literal="Drum6A Modulation Destination"
	 * @generated
	 * @ordered
	 */
	public static final int OP_0B5_VALUE = 181;

	/**
	 * The '<em><b>OP 0B6</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 0B6</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_0B6
	 * @model literal="Drum6A Modulation BPM Sync"
	 * @generated
	 * @ordered
	 */
	public static final int OP_0B6_VALUE = 182;

	/**
	 * The '<em><b>OP 0B7</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 0B7</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_0B7
	 * @model literal="Drum6A Motion Seq Type"
	 * @generated
	 * @ordered
	 */
	public static final int OP_0B7_VALUE = 183;

	/**
	 * The '<em><b>OP 0C4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 0C4</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_0C4
	 * @model literal="Drum6B Pitch"
	 * @generated
	 * @ordered
	 */
	public static final int OP_0C4_VALUE = 196;

	/**
	 * The '<em><b>OP 0C5</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 0C5</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_0C5
	 * @model literal="Drum6B Filter Type"
	 * @generated
	 * @ordered
	 */
	public static final int OP_0C5_VALUE = 197;

	/**
	 * The '<em><b>OP 0C6</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 0C6</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_0C6
	 * @model literal="Drum6B Filter Cutoff"
	 * @generated
	 * @ordered
	 */
	public static final int OP_0C6_VALUE = 198;

	/**
	 * The '<em><b>OP 0C7</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 0C7</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_0C7
	 * @model literal="Drum6B Filter Resonance"
	 * @generated
	 * @ordered
	 */
	public static final int OP_0C7_VALUE = 199;

	/**
	 * The '<em><b>OP 0C8</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 0C8</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_0C8
	 * @model literal="Drum6B Filter EG Int"
	 * @generated
	 * @ordered
	 */
	public static final int OP_0C8_VALUE = 200;

	/**
	 * The '<em><b>OP 0C9</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 0C9</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_0C9
	 * @model literal="Drum6B Start Point"
	 * @generated
	 * @ordered
	 */
	public static final int OP_0C9_VALUE = 201;

	/**
	 * The '<em><b>OP 0CA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 0CA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_0CA
	 * @model literal="Drum6B Level"
	 * @generated
	 * @ordered
	 */
	public static final int OP_0CA_VALUE = 202;

	/**
	 * The '<em><b>OP 0CB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 0CB</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_0CB
	 * @model literal="Drum6B Pan"
	 * @generated
	 * @ordered
	 */
	public static final int OP_0CB_VALUE = 203;

	/**
	 * The '<em><b>OP 0CC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 0CC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_0CC
	 * @model literal="Drum6B EG Time"
	 * @generated
	 * @ordered
	 */
	public static final int OP_0CC_VALUE = 204;

	/**
	 * The '<em><b>OP 0CD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 0CD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_0CD
	 * @model literal="Drum6B Amp EG"
	 * @generated
	 * @ordered
	 */
	public static final int OP_0CD_VALUE = 205;

	/**
	 * The '<em><b>OP 0CE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 0CE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_0CE
	 * @model literal="Drum6B Roll"
	 * @generated
	 * @ordered
	 */
	public static final int OP_0CE_VALUE = 206;

	/**
	 * The '<em><b>OP 0CF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 0CF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_0CF
	 * @model literal="Drum6B Reverse"
	 * @generated
	 * @ordered
	 */
	public static final int OP_0CF_VALUE = 207;

	/**
	 * The '<em><b>OP 0D0</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 0D0</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_0D0
	 * @model literal="Drum6B Effect Send"
	 * @generated
	 * @ordered
	 */
	public static final int OP_0D0_VALUE = 208;

	/**
	 * The '<em><b>OP 0D1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 0D1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_0D1
	 * @model literal="Drum6B Effect Select"
	 * @generated
	 * @ordered
	 */
	public static final int OP_0D1_VALUE = 209;

	/**
	 * The '<em><b>OP 0D2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 0D2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_0D2
	 * @model literal="Drum6B Modulation Type"
	 * @generated
	 * @ordered
	 */
	public static final int OP_0D2_VALUE = 210;

	/**
	 * The '<em><b>OP 0D3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 0D3</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_0D3
	 * @model literal="Drum6B Modulation Depth"
	 * @generated
	 * @ordered
	 */
	public static final int OP_0D3_VALUE = 211;

	/**
	 * The '<em><b>OP 0D4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 0D4</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_0D4
	 * @model literal="Drum6B Modulation Speed"
	 * @generated
	 * @ordered
	 */
	public static final int OP_0D4_VALUE = 212;

	/**
	 * The '<em><b>OP 0D5</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 0D5</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_0D5
	 * @model literal="Drum6B Modulation Destination"
	 * @generated
	 * @ordered
	 */
	public static final int OP_0D5_VALUE = 213;

	/**
	 * The '<em><b>OP 0D6</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 0D6</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_0D6
	 * @model literal="Drum6B Modulation BPM Sync"
	 * @generated
	 * @ordered
	 */
	public static final int OP_0D6_VALUE = 214;

	/**
	 * The '<em><b>OP 0D7</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 0D7</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_0D7
	 * @model literal="Drum6B Motion Seq Type"
	 * @generated
	 * @ordered
	 */
	public static final int OP_0D7_VALUE = 215;

	/**
	 * The '<em><b>OP 0E4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 0E4</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_0E4
	 * @model literal="Drum7A Pitch"
	 * @generated
	 * @ordered
	 */
	public static final int OP_0E4_VALUE = 228;

	/**
	 * The '<em><b>OP 0E5</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 0E5</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_0E5
	 * @model literal="Drum7A Filter Type"
	 * @generated
	 * @ordered
	 */
	public static final int OP_0E5_VALUE = 229;

	/**
	 * The '<em><b>OP 0E6</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 0E6</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_0E6
	 * @model literal="Drum7A Filter Cutoff"
	 * @generated
	 * @ordered
	 */
	public static final int OP_0E6_VALUE = 230;

	/**
	 * The '<em><b>OP 0E7</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 0E7</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_0E7
	 * @model literal="Drum7A Filter Resonance"
	 * @generated
	 * @ordered
	 */
	public static final int OP_0E7_VALUE = 231;

	/**
	 * The '<em><b>OP 0E8</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 0E8</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_0E8
	 * @model literal="Drum7A Filter EG Int"
	 * @generated
	 * @ordered
	 */
	public static final int OP_0E8_VALUE = 232;

	/**
	 * The '<em><b>OP 0E9</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 0E9</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_0E9
	 * @model literal="Drum7A Start Point"
	 * @generated
	 * @ordered
	 */
	public static final int OP_0E9_VALUE = 233;

	/**
	 * The '<em><b>OP 0EA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 0EA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_0EA
	 * @model literal="Drum7A Level"
	 * @generated
	 * @ordered
	 */
	public static final int OP_0EA_VALUE = 234;

	/**
	 * The '<em><b>OP 0EB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 0EB</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_0EB
	 * @model literal="Drum7A Pan"
	 * @generated
	 * @ordered
	 */
	public static final int OP_0EB_VALUE = 235;

	/**
	 * The '<em><b>OP 0EC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 0EC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_0EC
	 * @model literal="Drum7A EG Time"
	 * @generated
	 * @ordered
	 */
	public static final int OP_0EC_VALUE = 236;

	/**
	 * The '<em><b>OP 0ED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 0ED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_0ED
	 * @model literal="Drum7A Amp EG"
	 * @generated
	 * @ordered
	 */
	public static final int OP_0ED_VALUE = 237;

	/**
	 * The '<em><b>OP 0EE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 0EE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_0EE
	 * @model literal="Drum7A Roll"
	 * @generated
	 * @ordered
	 */
	public static final int OP_0EE_VALUE = 238;

	/**
	 * The '<em><b>OP 0EF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 0EF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_0EF
	 * @model literal="Drum7A Reverse"
	 * @generated
	 * @ordered
	 */
	public static final int OP_0EF_VALUE = 239;

	/**
	 * The '<em><b>OP 0F0</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 0F0</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_0F0
	 * @model literal="Drum7A Effect Send"
	 * @generated
	 * @ordered
	 */
	public static final int OP_0F0_VALUE = 240;

	/**
	 * The '<em><b>OP 0F1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 0F1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_0F1
	 * @model literal="Drum7A Effect Select"
	 * @generated
	 * @ordered
	 */
	public static final int OP_0F1_VALUE = 241;

	/**
	 * The '<em><b>OP 0F2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 0F2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_0F2
	 * @model literal="Drum7A Modulation Type"
	 * @generated
	 * @ordered
	 */
	public static final int OP_0F2_VALUE = 242;

	/**
	 * The '<em><b>OP 0F3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 0F3</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_0F3
	 * @model literal="Drum7A Modulation Depth"
	 * @generated
	 * @ordered
	 */
	public static final int OP_0F3_VALUE = 243;

	/**
	 * The '<em><b>OP 0F4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 0F4</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_0F4
	 * @model literal="Drum7A Modulation Speed"
	 * @generated
	 * @ordered
	 */
	public static final int OP_0F4_VALUE = 244;

	/**
	 * The '<em><b>OP 0F5</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 0F5</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_0F5
	 * @model literal="Drum7A Modulation Destination"
	 * @generated
	 * @ordered
	 */
	public static final int OP_0F5_VALUE = 245;

	/**
	 * The '<em><b>OP 0F6</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 0F6</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_0F6
	 * @model literal="Drum7A Modulation BPM Sync"
	 * @generated
	 * @ordered
	 */
	public static final int OP_0F6_VALUE = 246;

	/**
	 * The '<em><b>OP 0F7</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 0F7</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_0F7
	 * @model literal="Drum7A Motion Seq Type"
	 * @generated
	 * @ordered
	 */
	public static final int OP_0F7_VALUE = 247;

	/**
	 * The '<em><b>OP 104</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 104</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_104
	 * @model literal="Drum7B Pitch"
	 * @generated
	 * @ordered
	 */
	public static final int OP_104_VALUE = 260;

	/**
	 * The '<em><b>OP 105</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 105</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_105
	 * @model literal="Drum7B Filter Type"
	 * @generated
	 * @ordered
	 */
	public static final int OP_105_VALUE = 261;

	/**
	 * The '<em><b>OP 106</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 106</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_106
	 * @model literal="Drum7B Filter Cutoff"
	 * @generated
	 * @ordered
	 */
	public static final int OP_106_VALUE = 262;

	/**
	 * The '<em><b>OP 107</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 107</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_107
	 * @model literal="Drum7B Filter Resonance"
	 * @generated
	 * @ordered
	 */
	public static final int OP_107_VALUE = 263;

	/**
	 * The '<em><b>OP 108</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 108</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_108
	 * @model literal="Drum7B Filter EG Int"
	 * @generated
	 * @ordered
	 */
	public static final int OP_108_VALUE = 264;

	/**
	 * The '<em><b>OP 109</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 109</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_109
	 * @model literal="Drum7B Start Point"
	 * @generated
	 * @ordered
	 */
	public static final int OP_109_VALUE = 265;

	/**
	 * The '<em><b>OP 10A</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 10A</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_10A
	 * @model literal="Drum7B Level"
	 * @generated
	 * @ordered
	 */
	public static final int OP_10A_VALUE = 266;

	/**
	 * The '<em><b>OP 10B</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 10B</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_10B
	 * @model literal="Drum7B Pan"
	 * @generated
	 * @ordered
	 */
	public static final int OP_10B_VALUE = 267;

	/**
	 * The '<em><b>OP 10C</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 10C</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_10C
	 * @model literal="Drum7B EG Time"
	 * @generated
	 * @ordered
	 */
	public static final int OP_10C_VALUE = 268;

	/**
	 * The '<em><b>OP 10D</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 10D</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_10D
	 * @model literal="Drum7B Amp EG"
	 * @generated
	 * @ordered
	 */
	public static final int OP_10D_VALUE = 269;

	/**
	 * The '<em><b>OP 10E</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 10E</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_10E
	 * @model literal="Drum7B Roll"
	 * @generated
	 * @ordered
	 */
	public static final int OP_10E_VALUE = 270;

	/**
	 * The '<em><b>OP 10F</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 10F</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_10F
	 * @model literal="Drum7B Reverse"
	 * @generated
	 * @ordered
	 */
	public static final int OP_10F_VALUE = 271;

	/**
	 * The '<em><b>OP 110</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 110</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_110
	 * @model literal="Drum7B Effect Send"
	 * @generated
	 * @ordered
	 */
	public static final int OP_110_VALUE = 272;

	/**
	 * The '<em><b>OP 111</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 111</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_111
	 * @model literal="Drum7B Effect Select"
	 * @generated
	 * @ordered
	 */
	public static final int OP_111_VALUE = 273;

	/**
	 * The '<em><b>OP 112</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 112</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_112
	 * @model literal="Drum7B Modulation Type"
	 * @generated
	 * @ordered
	 */
	public static final int OP_112_VALUE = 274;

	/**
	 * The '<em><b>OP 113</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 113</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_113
	 * @model literal="Drum7B Modulation Depth"
	 * @generated
	 * @ordered
	 */
	public static final int OP_113_VALUE = 275;

	/**
	 * The '<em><b>OP 114</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 114</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_114
	 * @model literal="Drum7B Modulation Speed"
	 * @generated
	 * @ordered
	 */
	public static final int OP_114_VALUE = 276;

	/**
	 * The '<em><b>OP 115</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 115</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_115
	 * @model literal="Drum7B Modulation Destination"
	 * @generated
	 * @ordered
	 */
	public static final int OP_115_VALUE = 277;

	/**
	 * The '<em><b>OP 116</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 116</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_116
	 * @model literal="Drum7B Modulation BPM Sync"
	 * @generated
	 * @ordered
	 */
	public static final int OP_116_VALUE = 278;

	/**
	 * The '<em><b>OP 117</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 117</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_117
	 * @model literal="Drum7B Motion Seq Type"
	 * @generated
	 * @ordered
	 */
	public static final int OP_117_VALUE = 279;

	/**
	 * The '<em><b>OP 123</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 123</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_123
	 * @model literal="Keyboard1 Glide"
	 * @generated
	 * @ordered
	 */
	public static final int OP_123_VALUE = 291;

	/**
	 * The '<em><b>OP 125</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 125</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_125
	 * @model literal="Keyboard1 Filter Type"
	 * @generated
	 * @ordered
	 */
	public static final int OP_125_VALUE = 293;

	/**
	 * The '<em><b>OP 126</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 126</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_126
	 * @model literal="Keyboard1 Filter Cutoff"
	 * @generated
	 * @ordered
	 */
	public static final int OP_126_VALUE = 294;

	/**
	 * The '<em><b>OP 127</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 127</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_127
	 * @model literal="Keyboard1 Filter Resonance"
	 * @generated
	 * @ordered
	 */
	public static final int OP_127_VALUE = 295;

	/**
	 * The '<em><b>OP 128</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 128</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_128
	 * @model literal="Keyboard1 Filter EG Int"
	 * @generated
	 * @ordered
	 */
	public static final int OP_128_VALUE = 296;

	/**
	 * The '<em><b>OP 129</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 129</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_129
	 * @model literal="Keyboard1 Start Point"
	 * @generated
	 * @ordered
	 */
	public static final int OP_129_VALUE = 297;

	/**
	 * The '<em><b>OP 12A</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 12A</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_12A
	 * @model literal="Keyboard1 Level"
	 * @generated
	 * @ordered
	 */
	public static final int OP_12A_VALUE = 298;

	/**
	 * The '<em><b>OP 12B</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 12B</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_12B
	 * @model literal="Keyboard1 Pan"
	 * @generated
	 * @ordered
	 */
	public static final int OP_12B_VALUE = 299;

	/**
	 * The '<em><b>OP 12C</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 12C</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_12C
	 * @model literal="Keyboard1 EG Time"
	 * @generated
	 * @ordered
	 */
	public static final int OP_12C_VALUE = 300;

	/**
	 * The '<em><b>OP 12D</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 12D</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_12D
	 * @model literal="Keyboard1 Amp EG"
	 * @generated
	 * @ordered
	 */
	public static final int OP_12D_VALUE = 301;

	/**
	 * The '<em><b>OP 12E</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 12E</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_12E
	 * @model literal="Keyboard1 Roll"
	 * @generated
	 * @ordered
	 */
	public static final int OP_12E_VALUE = 302;

	/**
	 * The '<em><b>OP 12F</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 12F</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_12F
	 * @model literal="Keyboard1 Reverse"
	 * @generated
	 * @ordered
	 */
	public static final int OP_12F_VALUE = 303;

	/**
	 * The '<em><b>OP 130</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 130</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_130
	 * @model literal="Keyboard1 Effect Send"
	 * @generated
	 * @ordered
	 */
	public static final int OP_130_VALUE = 304;

	/**
	 * The '<em><b>OP 131</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 131</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_131
	 * @model literal="Keyboard1 Effect Select"
	 * @generated
	 * @ordered
	 */
	public static final int OP_131_VALUE = 305;

	/**
	 * The '<em><b>OP 132</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 132</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_132
	 * @model literal="Keyboard1 Modulation Type"
	 * @generated
	 * @ordered
	 */
	public static final int OP_132_VALUE = 306;

	/**
	 * The '<em><b>OP 133</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 133</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_133
	 * @model literal="Keyboard1 Modulation Depth"
	 * @generated
	 * @ordered
	 */
	public static final int OP_133_VALUE = 307;

	/**
	 * The '<em><b>OP 134</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 134</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_134
	 * @model literal="Keyboard1 Modulation Speed"
	 * @generated
	 * @ordered
	 */
	public static final int OP_134_VALUE = 308;

	/**
	 * The '<em><b>OP 135</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 135</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_135
	 * @model literal="Keyboard1 Modulation Destination"
	 * @generated
	 * @ordered
	 */
	public static final int OP_135_VALUE = 309;

	/**
	 * The '<em><b>OP 136</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 136</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_136
	 * @model literal="Keyboard1 Modulation BPM Sync"
	 * @generated
	 * @ordered
	 */
	public static final int OP_136_VALUE = 310;

	/**
	 * The '<em><b>OP 137</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 137</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_137
	 * @model literal="Keyboard1 Motion Seq Type"
	 * @generated
	 * @ordered
	 */
	public static final int OP_137_VALUE = 311;

	/**
	 * The '<em><b>OP 143</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 143</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_143
	 * @model literal="Keyboard2 Glide"
	 * @generated
	 * @ordered
	 */
	public static final int OP_143_VALUE = 323;

	/**
	 * The '<em><b>OP 145</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 145</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_145
	 * @model literal="Keyboard2 Filter Type"
	 * @generated
	 * @ordered
	 */
	public static final int OP_145_VALUE = 325;

	/**
	 * The '<em><b>OP 146</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 146</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_146
	 * @model literal="Keyboard2 Filter Cutoff"
	 * @generated
	 * @ordered
	 */
	public static final int OP_146_VALUE = 326;

	/**
	 * The '<em><b>OP 147</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 147</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_147
	 * @model literal="Keyboard2 Filter Resonance"
	 * @generated
	 * @ordered
	 */
	public static final int OP_147_VALUE = 327;

	/**
	 * The '<em><b>OP 148</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 148</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_148
	 * @model literal="Keyboard2 Filter EG Int"
	 * @generated
	 * @ordered
	 */
	public static final int OP_148_VALUE = 328;

	/**
	 * The '<em><b>OP 149</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 149</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_149
	 * @model literal="Keyboard2 Start Point"
	 * @generated
	 * @ordered
	 */
	public static final int OP_149_VALUE = 329;

	/**
	 * The '<em><b>OP 14A</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 14A</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_14A
	 * @model literal="Keyboard2 Level"
	 * @generated
	 * @ordered
	 */
	public static final int OP_14A_VALUE = 330;

	/**
	 * The '<em><b>OP 14B</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 14B</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_14B
	 * @model literal="Keyboard2 Pan"
	 * @generated
	 * @ordered
	 */
	public static final int OP_14B_VALUE = 331;

	/**
	 * The '<em><b>OP 14C</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 14C</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_14C
	 * @model literal="Keyboard2 EG Time"
	 * @generated
	 * @ordered
	 */
	public static final int OP_14C_VALUE = 332;

	/**
	 * The '<em><b>OP 14D</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 14D</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_14D
	 * @model literal="Keyboard2 Amp EG"
	 * @generated
	 * @ordered
	 */
	public static final int OP_14D_VALUE = 333;

	/**
	 * The '<em><b>OP 14E</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 14E</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_14E
	 * @model literal="Keyboard2 Roll"
	 * @generated
	 * @ordered
	 */
	public static final int OP_14E_VALUE = 334;

	/**
	 * The '<em><b>OP 14F</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 14F</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_14F
	 * @model literal="Keyboard2 Reverse"
	 * @generated
	 * @ordered
	 */
	public static final int OP_14F_VALUE = 335;

	/**
	 * The '<em><b>OP 150</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 150</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_150
	 * @model literal="Keyboard2 Effect Send"
	 * @generated
	 * @ordered
	 */
	public static final int OP_150_VALUE = 336;

	/**
	 * The '<em><b>OP 151</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 151</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_151
	 * @model literal="Keyboard2 Effect Select"
	 * @generated
	 * @ordered
	 */
	public static final int OP_151_VALUE = 337;

	/**
	 * The '<em><b>OP 152</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 152</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_152
	 * @model literal="Keyboard2 Modulation Type"
	 * @generated
	 * @ordered
	 */
	public static final int OP_152_VALUE = 338;

	/**
	 * The '<em><b>OP 153</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 153</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_153
	 * @model literal="Keyboard2 Modulation Depth"
	 * @generated
	 * @ordered
	 */
	public static final int OP_153_VALUE = 339;

	/**
	 * The '<em><b>OP 154</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 154</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_154
	 * @model literal="Keyboard2 Modulation Speed"
	 * @generated
	 * @ordered
	 */
	public static final int OP_154_VALUE = 340;

	/**
	 * The '<em><b>OP 155</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 155</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_155
	 * @model literal="Keyboard2 Modulation Destination"
	 * @generated
	 * @ordered
	 */
	public static final int OP_155_VALUE = 341;

	/**
	 * The '<em><b>OP 156</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 156</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_156
	 * @model literal="Keyboard2 Modulation BPM Sync"
	 * @generated
	 * @ordered
	 */
	public static final int OP_156_VALUE = 342;

	/**
	 * The '<em><b>OP 157</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 157</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_157
	 * @model literal="Keyboard2 Motion Seq Type"
	 * @generated
	 * @ordered
	 */
	public static final int OP_157_VALUE = 343;

	/**
	 * The '<em><b>OP 164</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 164</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_164
	 * @model literal="Stretch1 Pitch"
	 * @generated
	 * @ordered
	 */
	public static final int OP_164_VALUE = 356;

	/**
	 * The '<em><b>OP 165</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 165</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_165
	 * @model literal="Stretch1 Filter Type"
	 * @generated
	 * @ordered
	 */
	public static final int OP_165_VALUE = 357;

	/**
	 * The '<em><b>OP 166</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 166</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_166
	 * @model literal="Stretch1 Filter Cutoff"
	 * @generated
	 * @ordered
	 */
	public static final int OP_166_VALUE = 358;

	/**
	 * The '<em><b>OP 167</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 167</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_167
	 * @model literal="Stretch1 Filter Resonance"
	 * @generated
	 * @ordered
	 */
	public static final int OP_167_VALUE = 359;

	/**
	 * The '<em><b>OP 168</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 168</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_168
	 * @model literal="Stretch1 Filter EG Int"
	 * @generated
	 * @ordered
	 */
	public static final int OP_168_VALUE = 360;

	/**
	 * The '<em><b>OP 169</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 169</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_169
	 * @model literal="Stretch1 Start Point"
	 * @generated
	 * @ordered
	 */
	public static final int OP_169_VALUE = 361;

	/**
	 * The '<em><b>OP 16A</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 16A</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_16A
	 * @model literal="Stretch1 Level"
	 * @generated
	 * @ordered
	 */
	public static final int OP_16A_VALUE = 362;

	/**
	 * The '<em><b>OP 16B</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 16B</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_16B
	 * @model literal="Stretch1 Pan"
	 * @generated
	 * @ordered
	 */
	public static final int OP_16B_VALUE = 363;

	/**
	 * The '<em><b>OP 16C</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 16C</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_16C
	 * @model literal="Stretch1 EG Time"
	 * @generated
	 * @ordered
	 */
	public static final int OP_16C_VALUE = 364;

	/**
	 * The '<em><b>OP 16D</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 16D</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_16D
	 * @model literal="Stretch1 Amp EG"
	 * @generated
	 * @ordered
	 */
	public static final int OP_16D_VALUE = 365;

	/**
	 * The '<em><b>OP 16E</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 16E</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_16E
	 * @model literal="Stretch1 Roll"
	 * @generated
	 * @ordered
	 */
	public static final int OP_16E_VALUE = 366;

	/**
	 * The '<em><b>OP 16F</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 16F</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_16F
	 * @model literal="Stretch1 Reverse"
	 * @generated
	 * @ordered
	 */
	public static final int OP_16F_VALUE = 367;

	/**
	 * The '<em><b>OP 170</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 170</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_170
	 * @model literal="Stretch1 Effect Send"
	 * @generated
	 * @ordered
	 */
	public static final int OP_170_VALUE = 368;

	/**
	 * The '<em><b>OP 171</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 171</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_171
	 * @model literal="Stretch1 Effect Select"
	 * @generated
	 * @ordered
	 */
	public static final int OP_171_VALUE = 369;

	/**
	 * The '<em><b>OP 172</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 172</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_172
	 * @model literal="Stretch1 Modulation Type"
	 * @generated
	 * @ordered
	 */
	public static final int OP_172_VALUE = 370;

	/**
	 * The '<em><b>OP 173</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 173</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_173
	 * @model literal="Stretch1 Modulation Depth"
	 * @generated
	 * @ordered
	 */
	public static final int OP_173_VALUE = 371;

	/**
	 * The '<em><b>OP 174</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 174</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_174
	 * @model literal="Stretch1 Modulation Speed"
	 * @generated
	 * @ordered
	 */
	public static final int OP_174_VALUE = 372;

	/**
	 * The '<em><b>OP 175</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 175</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_175
	 * @model literal="Stretch1 Modulation Destination"
	 * @generated
	 * @ordered
	 */
	public static final int OP_175_VALUE = 373;

	/**
	 * The '<em><b>OP 176</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 176</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_176
	 * @model literal="Stretch1 Modulation BPM Sync"
	 * @generated
	 * @ordered
	 */
	public static final int OP_176_VALUE = 374;

	/**
	 * The '<em><b>OP 177</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 177</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_177
	 * @model literal="Stretch1 Motion Seq Type"
	 * @generated
	 * @ordered
	 */
	public static final int OP_177_VALUE = 375;

	/**
	 * The '<em><b>OP 184</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 184</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_184
	 * @model literal="Stretch2 Pitch"
	 * @generated
	 * @ordered
	 */
	public static final int OP_184_VALUE = 388;

	/**
	 * The '<em><b>OP 185</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 185</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_185
	 * @model literal="Stretch2 Filter Type"
	 * @generated
	 * @ordered
	 */
	public static final int OP_185_VALUE = 389;

	/**
	 * The '<em><b>OP 186</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 186</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_186
	 * @model literal="Stretch2 Filter Cutoff"
	 * @generated
	 * @ordered
	 */
	public static final int OP_186_VALUE = 390;

	/**
	 * The '<em><b>OP 187</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 187</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_187
	 * @model literal="Stretch2 Filter Resonance"
	 * @generated
	 * @ordered
	 */
	public static final int OP_187_VALUE = 391;

	/**
	 * The '<em><b>OP 188</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 188</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_188
	 * @model literal="Stretch2 Filter EG Int"
	 * @generated
	 * @ordered
	 */
	public static final int OP_188_VALUE = 392;

	/**
	 * The '<em><b>OP 189</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 189</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_189
	 * @model literal="Stretch2 Start Point"
	 * @generated
	 * @ordered
	 */
	public static final int OP_189_VALUE = 393;

	/**
	 * The '<em><b>OP 18A</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 18A</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_18A
	 * @model literal="Stretch2 Level"
	 * @generated
	 * @ordered
	 */
	public static final int OP_18A_VALUE = 394;

	/**
	 * The '<em><b>OP 18B</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 18B</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_18B
	 * @model literal="Stretch2 Pan"
	 * @generated
	 * @ordered
	 */
	public static final int OP_18B_VALUE = 395;

	/**
	 * The '<em><b>OP 18C</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 18C</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_18C
	 * @model literal="Stretch2 EG Time"
	 * @generated
	 * @ordered
	 */
	public static final int OP_18C_VALUE = 396;

	/**
	 * The '<em><b>OP 18D</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 18D</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_18D
	 * @model literal="Stretch2 Amp EG"
	 * @generated
	 * @ordered
	 */
	public static final int OP_18D_VALUE = 397;

	/**
	 * The '<em><b>OP 18E</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 18E</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_18E
	 * @model literal="Stretch2 Roll"
	 * @generated
	 * @ordered
	 */
	public static final int OP_18E_VALUE = 398;

	/**
	 * The '<em><b>OP 18F</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 18F</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_18F
	 * @model literal="Stretch2 Reverse"
	 * @generated
	 * @ordered
	 */
	public static final int OP_18F_VALUE = 399;

	/**
	 * The '<em><b>OP 190</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 190</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_190
	 * @model literal="Stretch2 Effect Send"
	 * @generated
	 * @ordered
	 */
	public static final int OP_190_VALUE = 400;

	/**
	 * The '<em><b>OP 191</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 191</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_191
	 * @model literal="Stretch2 Effect Select"
	 * @generated
	 * @ordered
	 */
	public static final int OP_191_VALUE = 401;

	/**
	 * The '<em><b>OP 192</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 192</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_192
	 * @model literal="Stretch2 Modulation Type"
	 * @generated
	 * @ordered
	 */
	public static final int OP_192_VALUE = 402;

	/**
	 * The '<em><b>OP 193</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 193</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_193
	 * @model literal="Stretch2 Modulation Depth"
	 * @generated
	 * @ordered
	 */
	public static final int OP_193_VALUE = 403;

	/**
	 * The '<em><b>OP 194</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 194</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_194
	 * @model literal="Stretch2 Modulation Speed"
	 * @generated
	 * @ordered
	 */
	public static final int OP_194_VALUE = 404;

	/**
	 * The '<em><b>OP 195</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 195</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_195
	 * @model literal="Stretch2 Modulation Destination"
	 * @generated
	 * @ordered
	 */
	public static final int OP_195_VALUE = 405;

	/**
	 * The '<em><b>OP 196</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 196</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_196
	 * @model literal="Stretch2 Modulation BPM Sync"
	 * @generated
	 * @ordered
	 */
	public static final int OP_196_VALUE = 406;

	/**
	 * The '<em><b>OP 197</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 197</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_197
	 * @model literal="Stretch2 Motion Seq Type"
	 * @generated
	 * @ordered
	 */
	public static final int OP_197_VALUE = 407;

	/**
	 * The '<em><b>OP 1A4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 1A4</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_1A4
	 * @model literal="Slice Pitch"
	 * @generated
	 * @ordered
	 */
	public static final int OP_1A4_VALUE = 420;

	/**
	 * The '<em><b>OP 1A5</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 1A5</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_1A5
	 * @model literal="Slice Filter Type"
	 * @generated
	 * @ordered
	 */
	public static final int OP_1A5_VALUE = 421;

	/**
	 * The '<em><b>OP 1A6</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 1A6</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_1A6
	 * @model literal="Slice Filter Cutoff"
	 * @generated
	 * @ordered
	 */
	public static final int OP_1A6_VALUE = 422;

	/**
	 * The '<em><b>OP 1A7</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 1A7</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_1A7
	 * @model literal="Slice Filter Resonance"
	 * @generated
	 * @ordered
	 */
	public static final int OP_1A7_VALUE = 423;

	/**
	 * The '<em><b>OP 1A8</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 1A8</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_1A8
	 * @model literal="Slice Filter EG Int"
	 * @generated
	 * @ordered
	 */
	public static final int OP_1A8_VALUE = 424;

	/**
	 * The '<em><b>OP 1A9</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 1A9</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_1A9
	 * @model literal="Slice Start Point"
	 * @generated
	 * @ordered
	 */
	public static final int OP_1A9_VALUE = 425;

	/**
	 * The '<em><b>OP 1AA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 1AA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_1AA
	 * @model literal="Slice Level"
	 * @generated
	 * @ordered
	 */
	public static final int OP_1AA_VALUE = 426;

	/**
	 * The '<em><b>OP 1AB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 1AB</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_1AB
	 * @model literal="Slice Pan"
	 * @generated
	 * @ordered
	 */
	public static final int OP_1AB_VALUE = 427;

	/**
	 * The '<em><b>OP 1AC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 1AC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_1AC
	 * @model literal="Slice EG Time"
	 * @generated
	 * @ordered
	 */
	public static final int OP_1AC_VALUE = 428;

	/**
	 * The '<em><b>OP 1AD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 1AD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_1AD
	 * @model literal="Slice Amp EG"
	 * @generated
	 * @ordered
	 */
	public static final int OP_1AD_VALUE = 429;

	/**
	 * The '<em><b>OP 1AE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 1AE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_1AE
	 * @model literal="Slice Roll"
	 * @generated
	 * @ordered
	 */
	public static final int OP_1AE_VALUE = 430;

	/**
	 * The '<em><b>OP 1AF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 1AF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_1AF
	 * @model literal="Slice Reverse"
	 * @generated
	 * @ordered
	 */
	public static final int OP_1AF_VALUE = 431;

	/**
	 * The '<em><b>OP 1B0</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 1B0</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_1B0
	 * @model literal="Slice Effect Send"
	 * @generated
	 * @ordered
	 */
	public static final int OP_1B0_VALUE = 432;

	/**
	 * The '<em><b>OP 1B1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 1B1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_1B1
	 * @model literal="Slice Effect Select"
	 * @generated
	 * @ordered
	 */
	public static final int OP_1B1_VALUE = 433;

	/**
	 * The '<em><b>OP 1B2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 1B2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_1B2
	 * @model literal="Slice Modulation Type"
	 * @generated
	 * @ordered
	 */
	public static final int OP_1B2_VALUE = 434;

	/**
	 * The '<em><b>OP 1B3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 1B3</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_1B3
	 * @model literal="Slice Modulation Depth"
	 * @generated
	 * @ordered
	 */
	public static final int OP_1B3_VALUE = 435;

	/**
	 * The '<em><b>OP 1B4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 1B4</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_1B4
	 * @model literal="Slice Modulation Speed"
	 * @generated
	 * @ordered
	 */
	public static final int OP_1B4_VALUE = 436;

	/**
	 * The '<em><b>OP 1B5</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 1B5</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_1B5
	 * @model literal="Slice Modulation Destination"
	 * @generated
	 * @ordered
	 */
	public static final int OP_1B5_VALUE = 437;

	/**
	 * The '<em><b>OP 1B6</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 1B6</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_1B6
	 * @model literal="Slice Modulation BPM Sync"
	 * @generated
	 * @ordered
	 */
	public static final int OP_1B6_VALUE = 438;

	/**
	 * The '<em><b>OP 1B7</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 1B7</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_1B7
	 * @model literal="Slice Motion Seq Type"
	 * @generated
	 * @ordered
	 */
	public static final int OP_1B7_VALUE = 439;

	/**
	 * The '<em><b>OP 1C5</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 1C5</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_1C5
	 * @model literal="AudioIn Filter Type"
	 * @generated
	 * @ordered
	 */
	public static final int OP_1C5_VALUE = 453;

	/**
	 * The '<em><b>OP 1C6</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 1C6</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_1C6
	 * @model literal="AudioIn Filter Cutoff"
	 * @generated
	 * @ordered
	 */
	public static final int OP_1C6_VALUE = 454;

	/**
	 * The '<em><b>OP 1C7</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 1C7</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_1C7
	 * @model literal="AudioIn Filter Resonance"
	 * @generated
	 * @ordered
	 */
	public static final int OP_1C7_VALUE = 455;

	/**
	 * The '<em><b>OP 1C8</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 1C8</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_1C8
	 * @model literal="AudioIn Filter EG Int"
	 * @generated
	 * @ordered
	 */
	public static final int OP_1C8_VALUE = 456;

	/**
	 * The '<em><b>OP 1CA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 1CA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_1CA
	 * @model literal="AudioIn Level"
	 * @generated
	 * @ordered
	 */
	public static final int OP_1CA_VALUE = 458;

	/**
	 * The '<em><b>OP 1CB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 1CB</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_1CB
	 * @model literal="AudioIn Pan"
	 * @generated
	 * @ordered
	 */
	public static final int OP_1CB_VALUE = 459;

	/**
	 * The '<em><b>OP 1CC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 1CC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_1CC
	 * @model literal="AudioIn EG Time"
	 * @generated
	 * @ordered
	 */
	public static final int OP_1CC_VALUE = 460;

	/**
	 * The '<em><b>OP 1CD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 1CD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_1CD
	 * @model literal="AudioIn Amp EG"
	 * @generated
	 * @ordered
	 */
	public static final int OP_1CD_VALUE = 461;

	/**
	 * The '<em><b>OP 1CE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 1CE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_1CE
	 * @model literal="AudioIn Roll"
	 * @generated
	 * @ordered
	 */
	public static final int OP_1CE_VALUE = 462;

	/**
	 * The '<em><b>OP 1D0</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 1D0</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_1D0
	 * @model literal="AudioIn Effect Send"
	 * @generated
	 * @ordered
	 */
	public static final int OP_1D0_VALUE = 464;

	/**
	 * The '<em><b>OP 1D1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 1D1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_1D1
	 * @model literal="AudioIn Effect Select"
	 * @generated
	 * @ordered
	 */
	public static final int OP_1D1_VALUE = 465;

	/**
	 * The '<em><b>OP 1D2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 1D2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_1D2
	 * @model literal="AudioIn Modulation Type"
	 * @generated
	 * @ordered
	 */
	public static final int OP_1D2_VALUE = 466;

	/**
	 * The '<em><b>OP 1D3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 1D3</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_1D3
	 * @model literal="AudioIn Modulation Depth"
	 * @generated
	 * @ordered
	 */
	public static final int OP_1D3_VALUE = 467;

	/**
	 * The '<em><b>OP 1D4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 1D4</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_1D4
	 * @model literal="AudioIn Modulation Speed"
	 * @generated
	 * @ordered
	 */
	public static final int OP_1D4_VALUE = 468;

	/**
	 * The '<em><b>OP 1D5</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 1D5</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_1D5
	 * @model literal="AudioIn Modulation Destination"
	 * @generated
	 * @ordered
	 */
	public static final int OP_1D5_VALUE = 469;

	/**
	 * The '<em><b>OP 1D6</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 1D6</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_1D6
	 * @model literal="AudioIn Modulation BPM Sync"
	 * @generated
	 * @ordered
	 */
	public static final int OP_1D6_VALUE = 470;

	/**
	 * The '<em><b>OP 1D7</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 1D7</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_1D7
	 * @model literal="AudioIn Motion Seq Type"
	 * @generated
	 * @ordered
	 */
	public static final int OP_1D7_VALUE = 471;

	/**
	 * The '<em><b>OP 1E0</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 1E0</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_1E0
	 * @model literal="Accent Level"
	 * @generated
	 * @ordered
	 */
	public static final int OP_1E0_VALUE = 480;

	/**
	 * The '<em><b>OP 1E1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 1E1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_1E1
	 * @model literal="Accent Motion Seq SW"
	 * @generated
	 * @ordered
	 */
	public static final int OP_1E1_VALUE = 481;

	/**
	 * The '<em><b>OP 1E4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 1E4</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_1E4
	 * @model literal="FX1 Type"
	 * @generated
	 * @ordered
	 */
	public static final int OP_1E4_VALUE = 484;

	/**
	 * The '<em><b>OP 1E5</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 1E5</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_1E5
	 * @model literal="FX1 Edit1"
	 * @generated
	 * @ordered
	 */
	public static final int OP_1E5_VALUE = 485;

	/**
	 * The '<em><b>OP 1E6</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 1E6</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_1E6
	 * @model literal="FX1 Edit2"
	 * @generated
	 * @ordered
	 */
	public static final int OP_1E6_VALUE = 486;

	/**
	 * The '<em><b>OP 1E7</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 1E7</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_1E7
	 * @model literal="FX1 Motion Seq SW"
	 * @generated
	 * @ordered
	 */
	public static final int OP_1E7_VALUE = 487;

	/**
	 * The '<em><b>OP 1E8</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 1E8</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_1E8
	 * @model literal="FX2 Type"
	 * @generated
	 * @ordered
	 */
	public static final int OP_1E8_VALUE = 488;

	/**
	 * The '<em><b>OP 1E9</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 1E9</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_1E9
	 * @model literal="FX2 Edit1"
	 * @generated
	 * @ordered
	 */
	public static final int OP_1E9_VALUE = 489;

	/**
	 * The '<em><b>OP 1EA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 1EA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_1EA
	 * @model literal="FX2 Edit2"
	 * @generated
	 * @ordered
	 */
	public static final int OP_1EA_VALUE = 490;

	/**
	 * The '<em><b>OP 1EB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 1EB</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_1EB
	 * @model literal="FX2 Motion Seq SW"
	 * @generated
	 * @ordered
	 */
	public static final int OP_1EB_VALUE = 491;

	/**
	 * The '<em><b>OP 1EC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 1EC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_1EC
	 * @model literal="FX3 Type"
	 * @generated
	 * @ordered
	 */
	public static final int OP_1EC_VALUE = 492;

	/**
	 * The '<em><b>OP 1ED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 1ED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_1ED
	 * @model literal="FX3 Edit1"
	 * @generated
	 * @ordered
	 */
	public static final int OP_1ED_VALUE = 493;

	/**
	 * The '<em><b>OP 1EE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 1EE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_1EE
	 * @model literal="FX3 Edit2"
	 * @generated
	 * @ordered
	 */
	public static final int OP_1EE_VALUE = 494;

	/**
	 * The '<em><b>OP 1EF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 1EF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_1EF
	 * @model literal="FX3 Motion Seq SW"
	 * @generated
	 * @ordered
	 */
	public static final int OP_1EF_VALUE = 495;

	/**
	 * The '<em><b>OP 1F5</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OP 1F5</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OP_1F5
	 * @model literal="FX Chain"
	 * @generated
	 * @ordered
	 */
	public static final int OP_1F5_VALUE = 501;

	/**
	 * An array of all the '<em><b>Operation Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final OperationType[] VALUES_ARRAY = new OperationType[] {
			OP_UNKNOWN, OP_004, OP_005, OP_006, OP_007, OP_008, OP_009, OP_00A,
			OP_00B, OP_00C, OP_00D, OP_00E, OP_00F, OP_010, OP_011, OP_012,
			OP_013, OP_014, OP_015, OP_016, OP_017, OP_024, OP_025, OP_026,
			OP_027, OP_028, OP_029, OP_02A, OP_02B, OP_02C, OP_02D, OP_02E,
			OP_02F, OP_030, OP_031, OP_032, OP_033, OP_034, OP_035, OP_036,
			OP_037, OP_044, OP_045, OP_046, OP_047, OP_048, OP_049, OP_04A,
			OP_04B, OP_04C, OP_04D, OP_04E, OP_04F, OP_050, OP_051, OP_052,
			OP_053, OP_054, OP_055, OP_056, OP_057, OP_064, OP_065, OP_066,
			OP_067, OP_068, OP_069, OP_06A, OP_06B, OP_06C, OP_06D, OP_06E,
			OP_06F, OP_070, OP_071, OP_072, OP_073, OP_074, OP_075, OP_076,
			OP_077, OP_084, OP_085, OP_086, OP_087, OP_088, OP_089, OP_08A,
			OP_08B, OP_08C, OP_08D, OP_08E, OP_08F, OP_090, OP_091, OP_092,
			OP_093, OP_094, OP_095, OP_096, OP_097, OP_0A4, OP_0A5, OP_0A6,
			OP_0A7, OP_0A8, OP_0A9, OP_0AA, OP_0AB, OP_0AC, OP_0AD, OP_0AE,
			OP_0AF, OP_0B0, OP_0B1, OP_0B2, OP_0B3, OP_0B4, OP_0B5, OP_0B6,
			OP_0B7, OP_0C4, OP_0C5, OP_0C6, OP_0C7, OP_0C8, OP_0C9, OP_0CA,
			OP_0CB, OP_0CC, OP_0CD, OP_0CE, OP_0CF, OP_0D0, OP_0D1, OP_0D2,
			OP_0D3, OP_0D4, OP_0D5, OP_0D6, OP_0D7, OP_0E4, OP_0E5, OP_0E6,
			OP_0E7, OP_0E8, OP_0E9, OP_0EA, OP_0EB, OP_0EC, OP_0ED, OP_0EE,
			OP_0EF, OP_0F0, OP_0F1, OP_0F2, OP_0F3, OP_0F4, OP_0F5, OP_0F6,
			OP_0F7, OP_104, OP_105, OP_106, OP_107, OP_108, OP_109, OP_10A,
			OP_10B, OP_10C, OP_10D, OP_10E, OP_10F, OP_110, OP_111, OP_112,
			OP_113, OP_114, OP_115, OP_116, OP_117, OP_123, OP_125, OP_126,
			OP_127, OP_128, OP_129, OP_12A, OP_12B, OP_12C, OP_12D, OP_12E,
			OP_12F, OP_130, OP_131, OP_132, OP_133, OP_134, OP_135, OP_136,
			OP_137, OP_143, OP_145, OP_146, OP_147, OP_148, OP_149, OP_14A,
			OP_14B, OP_14C, OP_14D, OP_14E, OP_14F, OP_150, OP_151, OP_152,
			OP_153, OP_154, OP_155, OP_156, OP_157, OP_164, OP_165, OP_166,
			OP_167, OP_168, OP_169, OP_16A, OP_16B, OP_16C, OP_16D, OP_16E,
			OP_16F, OP_170, OP_171, OP_172, OP_173, OP_174, OP_175, OP_176,
			OP_177, OP_184, OP_185, OP_186, OP_187, OP_188, OP_189, OP_18A,
			OP_18B, OP_18C, OP_18D, OP_18E, OP_18F, OP_190, OP_191, OP_192,
			OP_193, OP_194, OP_195, OP_196, OP_197, OP_1A4, OP_1A5, OP_1A6,
			OP_1A7, OP_1A8, OP_1A9, OP_1AA, OP_1AB, OP_1AC, OP_1AD, OP_1AE,
			OP_1AF, OP_1B0, OP_1B1, OP_1B2, OP_1B3, OP_1B4, OP_1B5, OP_1B6,
			OP_1B7, OP_1C5, OP_1C6, OP_1C7, OP_1C8, OP_1CA, OP_1CB, OP_1CC,
			OP_1CD, OP_1CE, OP_1D0, OP_1D1, OP_1D2, OP_1D3, OP_1D4, OP_1D5,
			OP_1D6, OP_1D7, OP_1E0, OP_1E1, OP_1E4, OP_1E5, OP_1E6, OP_1E7,
			OP_1E8, OP_1E9, OP_1EA, OP_1EB, OP_1EC, OP_1ED, OP_1EE, OP_1EF,
			OP_1F5, };

	/**
	 * A public read-only list of all the '<em><b>Operation Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<OperationType> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Operation Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OperationType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OperationType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Operation Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OperationType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OperationType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Operation Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OperationType get(int value) {
		switch (value) {
		case OP_UNKNOWN_VALUE:
			return OP_UNKNOWN;
		case OP_004_VALUE:
			return OP_004;
		case OP_005_VALUE:
			return OP_005;
		case OP_006_VALUE:
			return OP_006;
		case OP_007_VALUE:
			return OP_007;
		case OP_008_VALUE:
			return OP_008;
		case OP_009_VALUE:
			return OP_009;
		case OP_00A_VALUE:
			return OP_00A;
		case OP_00B_VALUE:
			return OP_00B;
		case OP_00C_VALUE:
			return OP_00C;
		case OP_00D_VALUE:
			return OP_00D;
		case OP_00E_VALUE:
			return OP_00E;
		case OP_00F_VALUE:
			return OP_00F;
		case OP_010_VALUE:
			return OP_010;
		case OP_011_VALUE:
			return OP_011;
		case OP_012_VALUE:
			return OP_012;
		case OP_013_VALUE:
			return OP_013;
		case OP_014_VALUE:
			return OP_014;
		case OP_015_VALUE:
			return OP_015;
		case OP_016_VALUE:
			return OP_016;
		case OP_017_VALUE:
			return OP_017;
		case OP_024_VALUE:
			return OP_024;
		case OP_025_VALUE:
			return OP_025;
		case OP_026_VALUE:
			return OP_026;
		case OP_027_VALUE:
			return OP_027;
		case OP_028_VALUE:
			return OP_028;
		case OP_029_VALUE:
			return OP_029;
		case OP_02A_VALUE:
			return OP_02A;
		case OP_02B_VALUE:
			return OP_02B;
		case OP_02C_VALUE:
			return OP_02C;
		case OP_02D_VALUE:
			return OP_02D;
		case OP_02E_VALUE:
			return OP_02E;
		case OP_02F_VALUE:
			return OP_02F;
		case OP_030_VALUE:
			return OP_030;
		case OP_031_VALUE:
			return OP_031;
		case OP_032_VALUE:
			return OP_032;
		case OP_033_VALUE:
			return OP_033;
		case OP_034_VALUE:
			return OP_034;
		case OP_035_VALUE:
			return OP_035;
		case OP_036_VALUE:
			return OP_036;
		case OP_037_VALUE:
			return OP_037;
		case OP_044_VALUE:
			return OP_044;
		case OP_045_VALUE:
			return OP_045;
		case OP_046_VALUE:
			return OP_046;
		case OP_047_VALUE:
			return OP_047;
		case OP_048_VALUE:
			return OP_048;
		case OP_049_VALUE:
			return OP_049;
		case OP_04A_VALUE:
			return OP_04A;
		case OP_04B_VALUE:
			return OP_04B;
		case OP_04C_VALUE:
			return OP_04C;
		case OP_04D_VALUE:
			return OP_04D;
		case OP_04E_VALUE:
			return OP_04E;
		case OP_04F_VALUE:
			return OP_04F;
		case OP_050_VALUE:
			return OP_050;
		case OP_051_VALUE:
			return OP_051;
		case OP_052_VALUE:
			return OP_052;
		case OP_053_VALUE:
			return OP_053;
		case OP_054_VALUE:
			return OP_054;
		case OP_055_VALUE:
			return OP_055;
		case OP_056_VALUE:
			return OP_056;
		case OP_057_VALUE:
			return OP_057;
		case OP_064_VALUE:
			return OP_064;
		case OP_065_VALUE:
			return OP_065;
		case OP_066_VALUE:
			return OP_066;
		case OP_067_VALUE:
			return OP_067;
		case OP_068_VALUE:
			return OP_068;
		case OP_069_VALUE:
			return OP_069;
		case OP_06A_VALUE:
			return OP_06A;
		case OP_06B_VALUE:
			return OP_06B;
		case OP_06C_VALUE:
			return OP_06C;
		case OP_06D_VALUE:
			return OP_06D;
		case OP_06E_VALUE:
			return OP_06E;
		case OP_06F_VALUE:
			return OP_06F;
		case OP_070_VALUE:
			return OP_070;
		case OP_071_VALUE:
			return OP_071;
		case OP_072_VALUE:
			return OP_072;
		case OP_073_VALUE:
			return OP_073;
		case OP_074_VALUE:
			return OP_074;
		case OP_075_VALUE:
			return OP_075;
		case OP_076_VALUE:
			return OP_076;
		case OP_077_VALUE:
			return OP_077;
		case OP_084_VALUE:
			return OP_084;
		case OP_085_VALUE:
			return OP_085;
		case OP_086_VALUE:
			return OP_086;
		case OP_087_VALUE:
			return OP_087;
		case OP_088_VALUE:
			return OP_088;
		case OP_089_VALUE:
			return OP_089;
		case OP_08A_VALUE:
			return OP_08A;
		case OP_08B_VALUE:
			return OP_08B;
		case OP_08C_VALUE:
			return OP_08C;
		case OP_08D_VALUE:
			return OP_08D;
		case OP_08E_VALUE:
			return OP_08E;
		case OP_08F_VALUE:
			return OP_08F;
		case OP_090_VALUE:
			return OP_090;
		case OP_091_VALUE:
			return OP_091;
		case OP_092_VALUE:
			return OP_092;
		case OP_093_VALUE:
			return OP_093;
		case OP_094_VALUE:
			return OP_094;
		case OP_095_VALUE:
			return OP_095;
		case OP_096_VALUE:
			return OP_096;
		case OP_097_VALUE:
			return OP_097;
		case OP_0A4_VALUE:
			return OP_0A4;
		case OP_0A5_VALUE:
			return OP_0A5;
		case OP_0A6_VALUE:
			return OP_0A6;
		case OP_0A7_VALUE:
			return OP_0A7;
		case OP_0A8_VALUE:
			return OP_0A8;
		case OP_0A9_VALUE:
			return OP_0A9;
		case OP_0AA_VALUE:
			return OP_0AA;
		case OP_0AB_VALUE:
			return OP_0AB;
		case OP_0AC_VALUE:
			return OP_0AC;
		case OP_0AD_VALUE:
			return OP_0AD;
		case OP_0AE_VALUE:
			return OP_0AE;
		case OP_0AF_VALUE:
			return OP_0AF;
		case OP_0B0_VALUE:
			return OP_0B0;
		case OP_0B1_VALUE:
			return OP_0B1;
		case OP_0B2_VALUE:
			return OP_0B2;
		case OP_0B3_VALUE:
			return OP_0B3;
		case OP_0B4_VALUE:
			return OP_0B4;
		case OP_0B5_VALUE:
			return OP_0B5;
		case OP_0B6_VALUE:
			return OP_0B6;
		case OP_0B7_VALUE:
			return OP_0B7;
		case OP_0C4_VALUE:
			return OP_0C4;
		case OP_0C5_VALUE:
			return OP_0C5;
		case OP_0C6_VALUE:
			return OP_0C6;
		case OP_0C7_VALUE:
			return OP_0C7;
		case OP_0C8_VALUE:
			return OP_0C8;
		case OP_0C9_VALUE:
			return OP_0C9;
		case OP_0CA_VALUE:
			return OP_0CA;
		case OP_0CB_VALUE:
			return OP_0CB;
		case OP_0CC_VALUE:
			return OP_0CC;
		case OP_0CD_VALUE:
			return OP_0CD;
		case OP_0CE_VALUE:
			return OP_0CE;
		case OP_0CF_VALUE:
			return OP_0CF;
		case OP_0D0_VALUE:
			return OP_0D0;
		case OP_0D1_VALUE:
			return OP_0D1;
		case OP_0D2_VALUE:
			return OP_0D2;
		case OP_0D3_VALUE:
			return OP_0D3;
		case OP_0D4_VALUE:
			return OP_0D4;
		case OP_0D5_VALUE:
			return OP_0D5;
		case OP_0D6_VALUE:
			return OP_0D6;
		case OP_0D7_VALUE:
			return OP_0D7;
		case OP_0E4_VALUE:
			return OP_0E4;
		case OP_0E5_VALUE:
			return OP_0E5;
		case OP_0E6_VALUE:
			return OP_0E6;
		case OP_0E7_VALUE:
			return OP_0E7;
		case OP_0E8_VALUE:
			return OP_0E8;
		case OP_0E9_VALUE:
			return OP_0E9;
		case OP_0EA_VALUE:
			return OP_0EA;
		case OP_0EB_VALUE:
			return OP_0EB;
		case OP_0EC_VALUE:
			return OP_0EC;
		case OP_0ED_VALUE:
			return OP_0ED;
		case OP_0EE_VALUE:
			return OP_0EE;
		case OP_0EF_VALUE:
			return OP_0EF;
		case OP_0F0_VALUE:
			return OP_0F0;
		case OP_0F1_VALUE:
			return OP_0F1;
		case OP_0F2_VALUE:
			return OP_0F2;
		case OP_0F3_VALUE:
			return OP_0F3;
		case OP_0F4_VALUE:
			return OP_0F4;
		case OP_0F5_VALUE:
			return OP_0F5;
		case OP_0F6_VALUE:
			return OP_0F6;
		case OP_0F7_VALUE:
			return OP_0F7;
		case OP_104_VALUE:
			return OP_104;
		case OP_105_VALUE:
			return OP_105;
		case OP_106_VALUE:
			return OP_106;
		case OP_107_VALUE:
			return OP_107;
		case OP_108_VALUE:
			return OP_108;
		case OP_109_VALUE:
			return OP_109;
		case OP_10A_VALUE:
			return OP_10A;
		case OP_10B_VALUE:
			return OP_10B;
		case OP_10C_VALUE:
			return OP_10C;
		case OP_10D_VALUE:
			return OP_10D;
		case OP_10E_VALUE:
			return OP_10E;
		case OP_10F_VALUE:
			return OP_10F;
		case OP_110_VALUE:
			return OP_110;
		case OP_111_VALUE:
			return OP_111;
		case OP_112_VALUE:
			return OP_112;
		case OP_113_VALUE:
			return OP_113;
		case OP_114_VALUE:
			return OP_114;
		case OP_115_VALUE:
			return OP_115;
		case OP_116_VALUE:
			return OP_116;
		case OP_117_VALUE:
			return OP_117;
		case OP_123_VALUE:
			return OP_123;
		case OP_125_VALUE:
			return OP_125;
		case OP_126_VALUE:
			return OP_126;
		case OP_127_VALUE:
			return OP_127;
		case OP_128_VALUE:
			return OP_128;
		case OP_129_VALUE:
			return OP_129;
		case OP_12A_VALUE:
			return OP_12A;
		case OP_12B_VALUE:
			return OP_12B;
		case OP_12C_VALUE:
			return OP_12C;
		case OP_12D_VALUE:
			return OP_12D;
		case OP_12E_VALUE:
			return OP_12E;
		case OP_12F_VALUE:
			return OP_12F;
		case OP_130_VALUE:
			return OP_130;
		case OP_131_VALUE:
			return OP_131;
		case OP_132_VALUE:
			return OP_132;
		case OP_133_VALUE:
			return OP_133;
		case OP_134_VALUE:
			return OP_134;
		case OP_135_VALUE:
			return OP_135;
		case OP_136_VALUE:
			return OP_136;
		case OP_137_VALUE:
			return OP_137;
		case OP_143_VALUE:
			return OP_143;
		case OP_145_VALUE:
			return OP_145;
		case OP_146_VALUE:
			return OP_146;
		case OP_147_VALUE:
			return OP_147;
		case OP_148_VALUE:
			return OP_148;
		case OP_149_VALUE:
			return OP_149;
		case OP_14A_VALUE:
			return OP_14A;
		case OP_14B_VALUE:
			return OP_14B;
		case OP_14C_VALUE:
			return OP_14C;
		case OP_14D_VALUE:
			return OP_14D;
		case OP_14E_VALUE:
			return OP_14E;
		case OP_14F_VALUE:
			return OP_14F;
		case OP_150_VALUE:
			return OP_150;
		case OP_151_VALUE:
			return OP_151;
		case OP_152_VALUE:
			return OP_152;
		case OP_153_VALUE:
			return OP_153;
		case OP_154_VALUE:
			return OP_154;
		case OP_155_VALUE:
			return OP_155;
		case OP_156_VALUE:
			return OP_156;
		case OP_157_VALUE:
			return OP_157;
		case OP_164_VALUE:
			return OP_164;
		case OP_165_VALUE:
			return OP_165;
		case OP_166_VALUE:
			return OP_166;
		case OP_167_VALUE:
			return OP_167;
		case OP_168_VALUE:
			return OP_168;
		case OP_169_VALUE:
			return OP_169;
		case OP_16A_VALUE:
			return OP_16A;
		case OP_16B_VALUE:
			return OP_16B;
		case OP_16C_VALUE:
			return OP_16C;
		case OP_16D_VALUE:
			return OP_16D;
		case OP_16E_VALUE:
			return OP_16E;
		case OP_16F_VALUE:
			return OP_16F;
		case OP_170_VALUE:
			return OP_170;
		case OP_171_VALUE:
			return OP_171;
		case OP_172_VALUE:
			return OP_172;
		case OP_173_VALUE:
			return OP_173;
		case OP_174_VALUE:
			return OP_174;
		case OP_175_VALUE:
			return OP_175;
		case OP_176_VALUE:
			return OP_176;
		case OP_177_VALUE:
			return OP_177;
		case OP_184_VALUE:
			return OP_184;
		case OP_185_VALUE:
			return OP_185;
		case OP_186_VALUE:
			return OP_186;
		case OP_187_VALUE:
			return OP_187;
		case OP_188_VALUE:
			return OP_188;
		case OP_189_VALUE:
			return OP_189;
		case OP_18A_VALUE:
			return OP_18A;
		case OP_18B_VALUE:
			return OP_18B;
		case OP_18C_VALUE:
			return OP_18C;
		case OP_18D_VALUE:
			return OP_18D;
		case OP_18E_VALUE:
			return OP_18E;
		case OP_18F_VALUE:
			return OP_18F;
		case OP_190_VALUE:
			return OP_190;
		case OP_191_VALUE:
			return OP_191;
		case OP_192_VALUE:
			return OP_192;
		case OP_193_VALUE:
			return OP_193;
		case OP_194_VALUE:
			return OP_194;
		case OP_195_VALUE:
			return OP_195;
		case OP_196_VALUE:
			return OP_196;
		case OP_197_VALUE:
			return OP_197;
		case OP_1A4_VALUE:
			return OP_1A4;
		case OP_1A5_VALUE:
			return OP_1A5;
		case OP_1A6_VALUE:
			return OP_1A6;
		case OP_1A7_VALUE:
			return OP_1A7;
		case OP_1A8_VALUE:
			return OP_1A8;
		case OP_1A9_VALUE:
			return OP_1A9;
		case OP_1AA_VALUE:
			return OP_1AA;
		case OP_1AB_VALUE:
			return OP_1AB;
		case OP_1AC_VALUE:
			return OP_1AC;
		case OP_1AD_VALUE:
			return OP_1AD;
		case OP_1AE_VALUE:
			return OP_1AE;
		case OP_1AF_VALUE:
			return OP_1AF;
		case OP_1B0_VALUE:
			return OP_1B0;
		case OP_1B1_VALUE:
			return OP_1B1;
		case OP_1B2_VALUE:
			return OP_1B2;
		case OP_1B3_VALUE:
			return OP_1B3;
		case OP_1B4_VALUE:
			return OP_1B4;
		case OP_1B5_VALUE:
			return OP_1B5;
		case OP_1B6_VALUE:
			return OP_1B6;
		case OP_1B7_VALUE:
			return OP_1B7;
		case OP_1C5_VALUE:
			return OP_1C5;
		case OP_1C6_VALUE:
			return OP_1C6;
		case OP_1C7_VALUE:
			return OP_1C7;
		case OP_1C8_VALUE:
			return OP_1C8;
		case OP_1CA_VALUE:
			return OP_1CA;
		case OP_1CB_VALUE:
			return OP_1CB;
		case OP_1CC_VALUE:
			return OP_1CC;
		case OP_1CD_VALUE:
			return OP_1CD;
		case OP_1CE_VALUE:
			return OP_1CE;
		case OP_1D0_VALUE:
			return OP_1D0;
		case OP_1D1_VALUE:
			return OP_1D1;
		case OP_1D2_VALUE:
			return OP_1D2;
		case OP_1D3_VALUE:
			return OP_1D3;
		case OP_1D4_VALUE:
			return OP_1D4;
		case OP_1D5_VALUE:
			return OP_1D5;
		case OP_1D6_VALUE:
			return OP_1D6;
		case OP_1D7_VALUE:
			return OP_1D7;
		case OP_1E0_VALUE:
			return OP_1E0;
		case OP_1E1_VALUE:
			return OP_1E1;
		case OP_1E4_VALUE:
			return OP_1E4;
		case OP_1E5_VALUE:
			return OP_1E5;
		case OP_1E6_VALUE:
			return OP_1E6;
		case OP_1E7_VALUE:
			return OP_1E7;
		case OP_1E8_VALUE:
			return OP_1E8;
		case OP_1E9_VALUE:
			return OP_1E9;
		case OP_1EA_VALUE:
			return OP_1EA;
		case OP_1EB_VALUE:
			return OP_1EB;
		case OP_1EC_VALUE:
			return OP_1EC;
		case OP_1ED_VALUE:
			return OP_1ED;
		case OP_1EE_VALUE:
			return OP_1EE;
		case OP_1EF_VALUE:
			return OP_1EF;
		case OP_1F5_VALUE:
			return OP_1F5;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private OperationType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //OperationType
