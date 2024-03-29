USE [master]
GO
/****** Object:  Database [Book]    Script Date: 9/20/2019 10:14:56 AM ******/
CREATE DATABASE [Book]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'Book', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL12.MSSQLSERVER\MSSQL\DATA\Book.mdf' , SIZE = 5120KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'Book_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL12.MSSQLSERVER\MSSQL\DATA\BookBook_log.ldf' , SIZE = 1024KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
GO
ALTER DATABASE [Book] SET COMPATIBILITY_LEVEL = 120
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [Book].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [Book] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [Book] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [Book] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [Book] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [Book] SET ARITHABORT OFF 
GO
ALTER DATABASE [Book] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [Book] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [Book] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [Book] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [Book] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [Book] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [Book] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [Book] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [Book] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [Book] SET  DISABLE_BROKER 
GO
ALTER DATABASE [Book] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [Book] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [Book] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [Book] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [Book] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [Book] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [Book] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [Book] SET RECOVERY SIMPLE 
GO
ALTER DATABASE [Book] SET  MULTI_USER 
GO
ALTER DATABASE [Book] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [Book] SET DB_CHAINING OFF 
GO
ALTER DATABASE [Book] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [Book] SET TARGET_RECOVERY_TIME = 0 SECONDS 
GO
ALTER DATABASE [Book] SET DELAYED_DURABILITY = DISABLED 
GO
USE [Book]
GO
/****** Object:  Table [dbo].[CHITIET_HD]    Script Date: 9/20/2019 10:14:56 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[CHITIET_HD](
	[ID_CTHD] [int] IDENTITY(1,1) NOT NULL,
	[ID_HD] [int] NOT NULL,
	[ID_SACH] [int] NOT NULL,
	[SOLUONG] [nchar](10) NOT NULL,
	[DONGIA] [nchar](10) NOT NULL,
 CONSTRAINT [PK_CHITIET_HD] PRIMARY KEY CLUSTERED 
(
	[ID_CTHD] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[GIOHANG]    Script Date: 9/20/2019 10:14:56 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[GIOHANG](
	[ID_GIO] [int] IDENTITY(1,1) NOT NULL,
	[ID_SACH] [int] NOT NULL,
	[ID_KH] [int] NOT NULL,
	[SOLUONG] [int] NOT NULL,
 CONSTRAINT [PK_GIOHANG] PRIMARY KEY CLUSTERED 
(
	[ID_GIO] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[HOADON]    Script Date: 9/20/2019 10:14:56 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[HOADON](
	[ID_HD] [int] IDENTITY(1,1) NOT NULL,
	[ID_KH] [int] NOT NULL,
	[TINHTRANG] [nvarchar](50) NOT NULL,
	[NGAYLAP] [datetime] NOT NULL,
	[TONGGIA] [float] NOT NULL,
	[ID_NV] [int] NOT NULL,
	[NOINHAN] [nvarchar](50) NOT NULL,
	[GHICHU] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_HOADON] PRIMARY KEY CLUSTERED 
(
	[ID_HD] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[KHACHHANG]    Script Date: 9/20/2019 10:14:56 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[KHACHHANG](
	[ID_KH] [int] IDENTITY(1,1) NOT NULL,
	[TEN_KH] [nvarchar](50) NOT NULL,
	[SDT_KH] [nvarchar](50) NOT NULL,
	[EMAIL_KH] [nvarchar](50) NOT NULL,
	[DIACHI_KH] [nvarchar](50) NOT NULL,
	[NGAYSINH_KH] [datetime] NOT NULL,
	[GIOITINH_KH] [nvarchar](50) NOT NULL,
	[TENDANGNHAP] [nvarchar](50) NOT NULL,
	[PASSWORD] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_KHACHHANG] PRIMARY KEY CLUSTERED 
(
	[ID_KH] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[LOAISACH]    Script Date: 9/20/2019 10:14:56 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[LOAISACH](
	[ID_LOAI] [int] IDENTITY(1,1) NOT NULL,
	[TENLOAI] [nvarchar](50) NOT NULL,
	[ID_SACH] [int] NOT NULL,
 CONSTRAINT [PK_LOAISACH] PRIMARY KEY CLUSTERED 
(
	[ID_LOAI] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[NHANVIEN]    Script Date: 9/20/2019 10:14:56 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NHANVIEN](
	[ID_NV] [int] IDENTITY(1,1) NOT NULL,
	[HOTEN_NV] [nvarchar](50) NOT NULL,
	[SDT_NV] [nvarchar](50) NOT NULL,
	[EMAIL_NV] [nvarchar](50) NOT NULL,
	[DIACHI_NV] [nvarchar](50) NOT NULL,
	[NGAYSINH_NV] [datetime] NOT NULL,
	[GIOITINH_NV] [nvarchar](50) NOT NULL,
	[TENDANGNHAP] [nvarchar](50) NOT NULL,
	[PASSWORD] [nvarchar](50) NULL,
	[CHUCVU] [nvarchar](50) NOT NULL,
	[PHANQUYEN] [int] NOT NULL,
 CONSTRAINT [PK_NHANVIEN_1] PRIMARY KEY CLUSTERED 
(
	[ID_NV] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[NHAXUATBAN]    Script Date: 9/20/2019 10:14:56 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NHAXUATBAN](
	[ID_NXB] [int] IDENTITY(1,1) NOT NULL,
	[TEN_NXB] [nvarchar](50) NOT NULL,
	[DIACHINXB] [nvarchar](50) NOT NULL,
	[SDTNXB] [nvarchar](50) NOT NULL,
	[EMAILNXB] [nvarchar](50) NOT NULL,
	[ID_SACH] [int] NOT NULL,
 CONSTRAINT [PK_NHAXUATBAN] PRIMARY KEY CLUSTERED 
(
	[ID_NXB] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[SACH]    Script Date: 9/20/2019 10:14:56 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[SACH](
	[ID_SACH] [int] IDENTITY(1,1) NOT NULL,
	[ID_LOAI] [int] NOT NULL,
	[ID_NXB] [int] NOT NULL,
	[TENSACH] [nvarchar](50) NOT NULL,
	[TOMLUOCNOIDUNG] [nvarchar](100) NOT NULL,
	[SOTRANG] [int] NOT NULL,
	[NGONNGU] [nvarchar](50) NOT NULL,
	[PHIENBAN] [int] NOT NULL,
	[NAMXUATBAN] [date] NOT NULL,
	[DONGIA] [float] NOT NULL,
	[HINHANH] [varchar](50) NOT NULL,
	[TRANGTHAI] [nvarchar](50) NOT NULL,
	[ID_TG] [int] NOT NULL,
 CONSTRAINT [PK_SACH] PRIMARY KEY CLUSTERED 
(
	[ID_SACH] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[TACGIA]    Script Date: 9/20/2019 10:14:56 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[TACGIA](
	[ID_TG] [int] IDENTITY(1,1) NOT NULL,
	[ID_DAUSACH] [int] NOT NULL,
	[HOTENTG] [nvarchar](50) NOT NULL,
	[SDTTG] [nvarchar](50) NOT NULL,
	[EMAILTG] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_TACGIA] PRIMARY KEY CLUSTERED 
(
	[ID_TG] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
ALTER TABLE [dbo].[CHITIET_HD]  WITH CHECK ADD  CONSTRAINT [FK_CHITIET_HD_HOADON] FOREIGN KEY([ID_HD])
REFERENCES [dbo].[HOADON] ([ID_HD])
GO
ALTER TABLE [dbo].[CHITIET_HD] CHECK CONSTRAINT [FK_CHITIET_HD_HOADON]
GO
ALTER TABLE [dbo].[CHITIET_HD]  WITH CHECK ADD  CONSTRAINT [FK_CHITIET_HD_SACH] FOREIGN KEY([ID_SACH])
REFERENCES [dbo].[SACH] ([ID_SACH])
GO
ALTER TABLE [dbo].[CHITIET_HD] CHECK CONSTRAINT [FK_CHITIET_HD_SACH]
GO
ALTER TABLE [dbo].[HOADON]  WITH CHECK ADD  CONSTRAINT [FK_HOADON_KHACHHANG] FOREIGN KEY([ID_KH])
REFERENCES [dbo].[KHACHHANG] ([ID_KH])
GO
ALTER TABLE [dbo].[HOADON] CHECK CONSTRAINT [FK_HOADON_KHACHHANG]
GO
ALTER TABLE [dbo].[HOADON]  WITH CHECK ADD  CONSTRAINT [FK_HOADON_NHANVIEN] FOREIGN KEY([ID_NV])
REFERENCES [dbo].[NHANVIEN] ([ID_NV])
GO
ALTER TABLE [dbo].[HOADON] CHECK CONSTRAINT [FK_HOADON_NHANVIEN]
GO
ALTER TABLE [dbo].[SACH]  WITH CHECK ADD  CONSTRAINT [FK_SACH_LOAISACH] FOREIGN KEY([ID_LOAI])
REFERENCES [dbo].[LOAISACH] ([ID_LOAI])
GO
ALTER TABLE [dbo].[SACH] CHECK CONSTRAINT [FK_SACH_LOAISACH]
GO
ALTER TABLE [dbo].[SACH]  WITH CHECK ADD  CONSTRAINT [FK_SACH_NHAXUATBAN] FOREIGN KEY([ID_NXB])
REFERENCES [dbo].[NHAXUATBAN] ([ID_NXB])
GO
ALTER TABLE [dbo].[SACH] CHECK CONSTRAINT [FK_SACH_NHAXUATBAN]
GO
USE [master]
GO
ALTER DATABASE [Book] SET  READ_WRITE 
GO
