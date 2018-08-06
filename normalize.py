import pandas as pd

terror = pd.read_csv(globalterrorismdb_0617dist.csv)
terror.rename({'iyear':'year','imonth':'month','iday':'day','country_txt':'country','region_txt':'region','attacktype1_txt':'attack_type','targtype1':'target','targtype1_txt':'target_type','targsubtype1_txt':'target_subtype','target1':'specific_target','natlty1_txt':'target_nationality','gname':'perpetrator','guncertain1':'certainty','weaptype1_txt':'weapon_type','nkill':'fatalities','nwound':'wounded',},inplace=True)
