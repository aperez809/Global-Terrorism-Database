#!/usr/local/bin/python3

import pandas as pd

j
og_data = r'/Users/hko/Desktop/projects/terrorismdb.csv'

cols_attacktype = [attacktype_id, attacktype_txt]
pd.read_csv(og_data,usecols=cols_attacktype).to_csv(r'/Users/hko/Desktop/projects/attacktype.csv',index=False)

cols_city = [city]
pd.read_csv(og_data,usecols=cols_city).to_csv(r'/Users/hko/Desktop/projects/attacktype.csv',columns
        = ['city_id','city_txt'],index=True)

cols_country = [country_id, country_name]
pd.read_csv(og_data,usecols=cols_country).to_csv(r'/Users/hko/Desktop/projects/attacktype.csv',index=False)

cols_event = [event_id,
        attacktype_txt,year,month,day,doubtterr,summary,num_perps,]
pd.read_csv(og_data,usecols=cols_attacktype).to_csv(r'/Users/hko/Desktop/projects/attacktype.csv',index=False)

