package tp04;

public class Conditionnelle4 {

	public static void main(String[] args) {
		int p1 = 10, p2 = 9, p3 = -1, p4 = 4, p5 = 8; 
		int p6;
		
		//On crée d'abord une grande boucle avec l'enchaînement le plus "simple" (le plus visuel : p1 < p2 < p3 < p4 < p5)
		//puis on modifie chaque paramètre au fur-et-à-mesure. Pour p2 < p1 (le else de la première condition),
		//on recopie la grande boucle initiale en inversant p1 et p2 (voir plus bas).
		if (p1 < p2) {
			if (p2 < p3) {
				if (p3 < p4) {
					if (p4 < p5) {
						p6 = p3;
					}
					else {
						if (p5 < p1) {
							p6 = p2;
						}
						else {
							if (p5 < p2) {
								p6 = p2;
							}
							else {
								if (p5 < p3) {
									p6 = p5;
								}
								else p6 = p3;
							}
						}
					}
				}
				else {
					if (p5 > p3) {
						if (p4 < p1) {
							p6 = p2;
						}
						else {
							if (p4 < p2) {
								p6 = p2;
							}
							else p6 = p4;
						}
					}
					else {
						if (p4 < p5) {
							if (p5 < p1) {
								p6 = p1;
							}
							else {
								if (p5 < p2) {
									p6 = p5;
								}
								else
									if (p4 < p2) {
										p6 = p2;
									}
									else p6 = p4;
							}
						}
						else {
							if (p4 < p1) {
								p6 = p1;
							}
							else {
								if (p4 < p2) {
									p6 = p4;
								}
								else {
									if (p5 < p2) {
										p6 = p2;
									}
									else p6 = p5;
								}
							}
						}
					}
				}
			}
			//Ici on part d'abord du principe que toutes les variables sont plus petites que p2 pour avoir
			//un enchaînement de base plus simple. Ensuite, dans les else, on modifie l'emplacement de chaque variable
			//qui n'a pas déjà été placée dans une condition précédente par rapport à p2.
			else {
				if (p4 < p2) {
					if (p5 < p2) {
						if (p3 < p4) {
							if (p4 < p5) {
								if (p5 < p1) {
									p6 = p5;
								}
								else {
									if (p4 < p1) {
										p6 = p1;
									}
									else p6 = p4;
								}
							}
							else {
								if (p3 < p5) {
									if (p4 < p1) {
										p6 = p4;
									}
									else {
										if (p3 > p1) {
											p6 = p5;
										}
										else {
											if (p5 < p1) {
												p6 = p1;
											}
											else p6 = p5;
										}
									}
								}
								else {
									if (p4 < p1) {
										p6 = p4;
									}
									else {
										if (p5 > p1) {
											p6 = p3;
										}
										else {
											if (p3 < p1) {
												p6 = p1;
											}
											else p6 = p3;
										}
									}
								}
							}
						}
						else {
							if (p5 < p3) {
								if (p3 < p1) {
									p6 = p3;
								}
								else {
									if (p5 < p4) {
										if (p4 < p1) {
											p6 = p1;
										}
										else p6 = p4;
									}
									else {
										if (p5 < p1) {
											p6 = p1;
										}
										else p6 = p5;
									}
								}
							}
							else {
								if (p5 < p1) {
									p6 = p5;
								}
								else {
									if (p3 < p1) {
										p6 = p1;
									}
									else p6 = p3;
								}
							}
						}
					}
					else {
						if (p3 < p4) {
							if (p4 < p1) {
								p6 = p1;
							}
							else p6 = p4;
						}
						else {
							if (p3 < p1) {
								p6 = p1;
							}
							else p6 = p3;
						}
					}
				}
				else {
					if (p5 < p2) {
						if (p3 < p5) {
							if (p5 < p1) {
								p6 = p1;
							}
							else p6 = p5;
						}
						else {
							if (p3 < p1) {
								p6 = p1;
							}
							else p6 = p3;
						}
					}
					else p6 = p2;
				}
			}
		}
		else {
			//Même grande boucle qu'en haut mais en inversant p1 et p2
			if (p1 < p3) {
				if (p3 < p4) {
					if (p4 < p5) {
						p6 = p3;
					}
					else {
						if (p5 < p2) {
							p6 = p1;
						}
						else {
							if (p5 < p1) {
								p6 = p1;
							}
							else {
								if (p5 < p3) {
									p6 = p5;
								}
								else p6 = p3;
							}
						}
					}
				}
				else {
					if (p5 > p3) {
						if (p4 < p2) {
							p6 = p1;
						}
						else {
							if (p4 < p1) {
								p6 = p1;
							}
							else p6 = p4;
						}
					}
					else {
						if (p4 < p5) {
							if (p5 < p2) {
								p6 = p2;
							}
							else {
								if (p5 < p1) {
									p6 = p5;
								}
								else
									if (p4 < p1) {
										p6 = p1;
									}
									else p6 = p4;
							}
						}
						else {
							if (p4 < p2) {
								p6 = p2;
							}
							else {
								if (p4 < p1) {
									p6 = p4;
								}
								else {
									if (p5 < p1) {
										p6 = p1;
									}
									else p6 = p5;
								}
							}
						}
					}
				}
			}
			else {
				if (p4 < p1) {
					if (p5 < p1) {
						if (p3 < p4) {
							if (p4 < p5) {
								if (p5 < p2) {
									p6 = p5;
								}
								else {
									if (p4 < p2) {
										p6 = p2;
									}
									else p6 = p4;
								}
							}
							else {
								if (p3 < p5) {
									if (p4 < p2) {
										p6 = p4;
									}
									else {
										if (p3 > p2) {
											p6 = p5;
										}
										else {
											if (p5 < p2) {
												p6 = p2;
											}
											else p6 = p5;
										}
									}
								}
								else {
									if (p4 < p2) {
										p6 = p4;
									}
									else {
										if (p5 > p2) {
											p6 = p3;
										}
										else {
											if (p3 < p2) {
												p6 = p2;
											}
											else p6 = p3;
										}
									}
								}
							}
						}
						else {
							if (p5 < p3) {
								if (p3 < p2) {
									p6 = p3;
								}
								else {
									if (p5 < p4) {
										if (p4 < p2) {
											p6 = p2;
										}
										else p6 = p4;
									}
									else {
										if (p5 < p2) {
											p6 = p2;
										}
										else p6 = p5;
									}
								}
							}
							else {
								if (p5 < p2) {
									p6 = p5;
								}
								else {
									if (p3 < p2) {
										p6 = p2;
									}
									else p6 = p3;
								}
							}
						}
					}
					else {
						if (p3 < p4) {
							if (p4 < p2) {
								p6 = p2;
							}
							else p6 = p4;
						}
						else {
							if (p3 < p2) {
								p6 = p2;
							}
							else p6 = p3;
						}
					}
				}
				else {
					if (p5 < p1) {
						if (p3 < p5) {
							if (p5 < p2) {
								p6 = p2;
							}
							else p6 = p5;
						}
						else {
							if (p3 < p2) {
								p6 = p2;
							}
							else p6 = p3;
						}
					}
					else p6 = p1;
				}
			}
		}
		
		System.out.println(p6);
	}

}
