/*
  Navigation Table used to structure a hierarchical menu
 */
CREATE TABLE [dbo].[Navigation](
	[Id] [int] IDENTITY(1,1) NOT NULL,
	[Header] [varchar](255) NOT NULL,
	[Icon] [varchar](255) NULL,
	[Subheader] [varchar](255) NULL,
	[Url] [varchar](255) NULL,
	[ParentId] [int] NULL,
PRIMARY KEY CLUSTERED
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO

ALTER TABLE [dbo].[Navigation]  WITH CHECK ADD  CONSTRAINT [FK_Id_ParentId] FOREIGN KEY([ParentId])
REFERENCES [dbo].[Navigation] ([Id])
GO

ALTER TABLE [dbo].[Navigation] CHECK CONSTRAINT [CK_Id_ParentId]
GO