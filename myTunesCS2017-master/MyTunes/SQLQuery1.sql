/****** Script for SelectTopNRows command from SSMS  ******/
SELECT TOP (1000) [Song]
      ,[Artist]
      ,[Album]
      ,[Year]
  FROM [bestTunes].[dbo].[bestTunesTable]