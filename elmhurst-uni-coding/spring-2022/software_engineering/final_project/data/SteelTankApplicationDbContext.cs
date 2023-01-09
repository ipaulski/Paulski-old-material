using System;
using System.Collections.Generic;
using Microsoft.EntityFrameworkCore;
using Microsoft.EntityFrameworkCore.Metadata;
using SearchGenerator.Data;

namespace SearchGenerator.Models
{
    public partial class SteelTankApplicationDbContext : DbContext
    {
        public SteelTankApplicationDbContext()
        {

        }

        public SteelTankApplicationDbContext(DbContextOptions<SteelTankApplicationDbContext> options)
            : base(options)
        {
        }

        public virtual DbSet<CpcertifiedTestersList> CpcertifiedTestersLists { get; set; } = null!;
        public virtual DbSet<Sp001certifiedTankInspectorsList> Sp001certifiedTankInspectorsLists { get; set; } = null!;
//        protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
//        {
//          //  TODO - If database has errors with the builder, uncomment this and see if that helps
//                        if (!optionsBuilder.IsConfigured)
//            {
//#warning To protect potentially sensitive information in your connection string, you should move it out of source code. You can avoid scaffolding the connection string by using the Name= syntax to read it from configuration - see https://go.microsoft.com/fwlink/?linkid=2131148. For more guidance on storing connection strings, see http://go.microsoft.com/fwlink/?LinkId=723263.
//                optionsBuilder.UseSqlServer("Data Source =(localdb)\\MSSQLLocalDB;Database=SteelTankApplicationDb;Trusted_Connection=True;");
//            }
//        }

        protected override void OnModelCreating(ModelBuilder modelBuilder)
        {
            //modelBuilder.Entity<Answer>(entity =>
            //{
            //    entity.HasIndex(e => e.QuestionId, "IX_Answers_QuestionId");

            //    entity.HasOne(d => d.Question)
            //        .WithMany(p => p.Answers)
            //        .HasForeignKey(d => d.QuestionId);
            //});

            //modelBuilder.Entity<AspNetRole>(entity =>
            //{
            //    entity.HasIndex(e => e.NormalizedName, "RoleNameIndex")
            //        .IsUnique()
            //        .HasFilter("([NormalizedName] IS NOT NULL)");

            //    entity.Property(e => e.Name).HasMaxLength(256);

            //    entity.Property(e => e.NormalizedName).HasMaxLength(256);
            //});

            //modelBuilder.Entity<AspNetRoleClaim>(entity =>
            //{
            //    entity.HasIndex(e => e.RoleId, "IX_AspNetRoleClaims_RoleId");

            //    entity.HasOne(d => d.Role)
            //        .WithMany(p => p.AspNetRoleClaims)
            //        .HasForeignKey(d => d.RoleId);
            //});

            //modelBuilder.Entity<AspNetUser>(entity =>
            //{
            //    entity.HasIndex(e => e.NormalizedEmail, "EmailIndex");

            //    entity.HasIndex(e => e.UserFile1Id, "IX_AspNetUsers_UserFile1Id");

            //    entity.HasIndex(e => e.UserFile2Id, "IX_AspNetUsers_UserFile2Id");

            //    entity.HasIndex(e => e.UserFile3Id, "IX_AspNetUsers_UserFile3Id");

            //    entity.HasIndex(e => e.NormalizedUserName, "UserNameIndex")
            //        .IsUnique()
            //        .HasFilter("([NormalizedUserName] IS NOT NULL)");

            //    entity.Property(e => e.DateCertified).HasColumnType("date");

            //    entity.Property(e => e.Email).HasMaxLength(256);

            //    entity.Property(e => e.NormalizedEmail).HasMaxLength(256);

            //    entity.Property(e => e.NormalizedUserName).HasMaxLength(256);

            //    entity.Property(e => e.PaymentReceived)
            //        .IsRequired()
            //        .HasDefaultValueSql("(CONVERT([bit],(0)))");

            //    entity.Property(e => e.SiteInformationApproved)
            //        .IsRequired()
            //        .HasDefaultValueSql("(CONVERT([bit],(0)))");

            //    entity.Property(e => e.SiteInformationReceived)
            //        .IsRequired()
            //        .HasDefaultValueSql("(CONVERT([bit],(0)))");

            //    entity.Property(e => e.UserName).HasMaxLength(256);

            //    entity.HasOne(d => d.UserFile1)
            //        .WithMany(p => p.AspNetUserUserFile1s)
            //        .HasForeignKey(d => d.UserFile1Id);

            //    entity.HasOne(d => d.UserFile2)
            //        .WithMany(p => p.AspNetUserUserFile2s)
            //        .HasForeignKey(d => d.UserFile2Id);

            //    entity.HasOne(d => d.UserFile3)
            //        .WithMany(p => p.AspNetUserUserFile3s)
            //        .HasForeignKey(d => d.UserFile3Id);

            //    entity.HasMany(d => d.Roles)
            //        .WithMany(p => p.Users)
            //        .UsingEntity<Dictionary<string, object>>(
            //            "AspNetUserRole",
            //            l => l.HasOne<AspNetRole>().WithMany().HasForeignKey("RoleId"),
            //            r => r.HasOne<AspNetUser>().WithMany().HasForeignKey("UserId"),
            //            j =>
            //            {
            //                j.HasKey("UserId", "RoleId");

            //                j.ToTable("AspNetUserRoles");

            //                j.HasIndex(new[] { "RoleId" }, "IX_AspNetUserRoles_RoleId");
            //            });
            //});

            //modelBuilder.Entity<AspNetUserClaim>(entity =>
            //{
            //    entity.HasIndex(e => e.UserId, "IX_AspNetUserClaims_UserId");

            //    entity.HasOne(d => d.User)
            //        .WithMany(p => p.AspNetUserClaims)
            //        .HasForeignKey(d => d.UserId);
            //});

            //modelBuilder.Entity<AspNetUserLogin>(entity =>
            //{
            //    entity.HasKey(e => new { e.LoginProvider, e.ProviderKey });

            //    entity.HasIndex(e => e.UserId, "IX_AspNetUserLogins_UserId");

            //    entity.HasOne(d => d.User)
            //        .WithMany(p => p.AspNetUserLogins)
            //        .HasForeignKey(d => d.UserId);
            //});

            //modelBuilder.Entity<AspNetUserToken>(entity =>
            //{
            //    entity.HasKey(e => new { e.UserId, e.LoginProvider, e.Name });

            //    entity.HasOne(d => d.User)
            //        .WithMany(p => p.AspNetUserTokens)
            //        .HasForeignKey(d => d.UserId);
            //});

            modelBuilder.Entity<CpcertifiedTestersList>(entity =>
            {
                entity.HasNoKey();

                entity.ToTable("CPCertifiedTestersList");

                entity.Property(e => e.Address1).HasColumnName("ADDRESS_1");

                entity.Property(e => e.CcEMail).HasColumnName("CC_E_MAIL");

                entity.Property(e => e.City).HasColumnName("CITY");

                entity.Property(e => e.Company).HasColumnName("COMPANY");

                entity.Property(e => e.EMail).HasColumnName("E_MAIL");

                entity.Property(e => e.Fax).HasColumnName("FAX");

                entity.Property(e => e.First).HasColumnName("FIRST");

                entity.Property(e => e.Id).HasColumnName("ID");

                entity.Property(e => e.Last).HasColumnName("LAST");

                entity.Property(e => e.LicenseExpires).HasColumnName("LICENSE_EXPIRES");

                entity.Property(e => e.OriginalCertificationDate).HasColumnName("ORIGINAL_CERTIFICATION_DATE");

                entity.Property(e => e.Phone).HasColumnName("PHONE");

                entity.Property(e => e.St).HasColumnName("ST");

                entity.Property(e => e.Zip).HasColumnName("ZIP");
            });

            //modelBuilder.Entity<ImageFile>(entity =>
            //{
            //    entity.HasIndex(e => e.QuestionGroupId, "IX_ImageFiles_QuestionGroupId");

            //    entity.HasOne(d => d.QuestionGroup)
            //        .WithMany(p => p.ImageFiles)
            //        .HasForeignKey(d => d.QuestionGroupId);
            //});

            //modelBuilder.Entity<Question>(entity =>
            //{
            //    entity.HasIndex(e => e.AnswerId, "IX_Questions_AnswerId");

            //    entity.HasIndex(e => e.QuestionGroupId, "IX_Questions_QuestionGroupId");

            //    entity.Property(e => e.IsTextEntry)
            //        .IsRequired()
            //        .HasDefaultValueSql("(CONVERT([bit],(0)))");

            //    entity.HasOne(d => d.Answer)
            //        .WithMany(p => p.Questions)
            //        .HasForeignKey(d => d.AnswerId);

            //    entity.HasOne(d => d.QuestionGroup)
            //        .WithMany(p => p.Questions)
            //        .HasForeignKey(d => d.QuestionGroupId);
            //});

            //modelBuilder.Entity<QuestionGroup>(entity =>
            //{
            //    entity.HasIndex(e => e.ExamId, "IX_QuestionGroups_ExamId");

            //    entity.Property(e => e.Text).HasDefaultValueSql("(N'')");

            //    entity.HasOne(d => d.Exam)
            //        .WithMany(p => p.QuestionGroups)
            //        .HasForeignKey(d => d.ExamId);
            //});

            //modelBuilder.Entity<Registration>(entity =>
            //{
            //    entity.HasIndex(e => e.ApplicationUserId, "IX_Registrations_ApplicationUserId");

            //    entity.HasIndex(e => e.ExamId, "IX_Registrations_ExamId");

            //    entity.HasOne(d => d.ApplicationUser)
            //        .WithMany(p => p.Registrations)
            //        .HasForeignKey(d => d.ApplicationUserId);

            //    entity.HasOne(d => d.Exam)
            //        .WithMany(p => p.Registrations)
            //        .HasForeignKey(d => d.ExamId);
            //});

            modelBuilder.Entity<Sp001certifiedTankInspectorsList>(entity =>
            {
                entity.HasNoKey();

                entity.ToTable("SP001CertifiedTankInspectorsList");

                entity.Property(e => e.Address).HasColumnName("ADDRESS");

                entity.Property(e => e.CcEmail).HasColumnName("CC_EMAIL");

                entity.Property(e => e.City).HasColumnName("CITY");

                entity.Property(e => e.Company).HasColumnName("COMPANY");

                entity.Property(e => e.Email).HasColumnName("EMAIL");

                entity.Property(e => e.Fax).HasColumnName("FAX");

                entity.Property(e => e.First).HasColumnName("FIRST");

                entity.Property(e => e.Id).HasColumnName("ID");

                entity.Property(e => e.Last).HasColumnName("LAST");

                entity.Property(e => e.LicenseExpires).HasColumnName("LICENSE_EXPIRES");

                entity.Property(e => e.OriginalCertificationDate).HasColumnName("ORIGINAL_CERTIFICATION_DATE");

                entity.Property(e => e.Phone).HasColumnName("PHONE");

                entity.Property(e => e.St).HasColumnName("ST");

                entity.Property(e => e.Zip).HasColumnName("ZIP");
            });

            //modelBuilder.Entity<UserAnswer>(entity =>
            //{
            //    entity.HasIndex(e => e.AnswerId, "IX_UserAnswers_AnswerId");

            //    entity.HasIndex(e => e.QuestionId, "IX_UserAnswers_QuestionId");

            //    entity.HasIndex(e => e.RegistrationId, "IX_UserAnswers_RegistrationId");

            //    entity.Property(e => e.IsTextEntry)
            //        .IsRequired()
            //        .HasDefaultValueSql("(CONVERT([bit],(0)))");

            //    entity.HasOne(d => d.Answer)
            //        .WithMany(p => p.UserAnswers)
            //        .HasForeignKey(d => d.AnswerId);

            //    entity.HasOne(d => d.Question)
            //        .WithMany(p => p.UserAnswers)
            //        .HasForeignKey(d => d.QuestionId)
            //        .OnDelete(DeleteBehavior.ClientSetNull);

            //    entity.HasOne(d => d.Registration)
            //        .WithMany(p => p.UserAnswers)
            //        .HasForeignKey(d => d.RegistrationId)
            //        .OnDelete(DeleteBehavior.ClientSetNull);
            //});

            OnModelCreatingPartial(modelBuilder);
        }

        partial void OnModelCreatingPartial(ModelBuilder modelBuilder);
    }
}
